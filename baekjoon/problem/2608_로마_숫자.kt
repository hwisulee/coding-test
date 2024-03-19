import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine()
    val b = readLine()
    val sum = numMaker(a) + numMaker(b)
    val rome = strMaker(sum)

    bw.write("$sum\n$rome")
    bw.flush()
    bw.close()
}

fun strMaker(n: Int): String {
    var temp = n
    val sb = StringBuilder()
    val vld = BooleanArray(3) { false } // V, I, D
    val ixcm = IntArray(4) { 0 } // I, X, C, M
    val checker = BooleanArray(3) { false } // (IV, IX), (XL, XC), (CD, CM)

    repeater@ while (true) {
        if (temp >= 1000 && ixcm[3] <= 3) {
            temp -= 1000
            ixcm[3]++
            sb.append("M")
            continue@repeater
        }

        if (temp >= 900) {
            temp -= 900
            checker[2] = true
            sb.append("CM")
        }

        if (temp >= 500 && !vld[2]) {
            temp -= 500
            vld[2] = true
            sb.append("D")
        }

        if (temp >= 400 && !checker[2]) {
            temp -= 400
            checker[2] = true
            sb.append("CD")
        }

        if (temp >= 100 && ixcm[2] <= 3) {
            temp -= 100
            ixcm[2]++
            sb.append("C")
            continue@repeater
        }

        if (temp >= 90) {
            temp -= 90
            checker[1] = true
            sb.append("XC")
        }

        if (temp >= 50 && !vld[1]) {
            temp -= 50
            vld[1] = true
            sb.append("L")
        }

        if (temp >= 40 && !checker[1]) {
            temp -= 40
            checker[1] = true
            sb.append("XL")
        }

        if (temp >= 10 && ixcm[1] <= 3) {
            temp -= 10
            ixcm[1]++
            sb.append("X")
            continue@repeater
        }

        if (temp >= 9) {
            temp -= 9
            checker[0] = true
            sb.append("IX")
        }

        if (temp >= 5 && !vld[0]) {
            temp -= 5
            vld[0] = true
            sb.append("V")
        }

        if (temp >= 4 && !checker[0]) {
            temp -= 4
            checker[0] = true
            sb.append("IV")
        }

        if (temp >= 1 && ixcm[0] <= 3) {
            temp -= 1
            ixcm[0]++
            sb.append("I")
            continue@repeater
        }

        if (temp == 0) break@repeater
    }

    return sb.toString()
}

fun numMaker(n: String): Int {
    val list = mutableListOf<Int>()
    var idx = 0
    while (idx < n.length) {
        if (idx + 1 < n.length) {
            when ("${n[idx]}${n[idx + 1]}") {
                "IV" -> { list += 4; idx++ }
                "IX" -> { list += 9; idx++ }
                "XL" -> { list += 40; idx++ }
                "XC" -> { list += 90; idx++ }
                "CD" -> { list += 400; idx++ }
                "CM" -> { list += 900; idx++ }
                else -> list += toNum(n[idx].toString())
            }
        } else {
            list += toNum(n[idx].toString())
        }
        idx++
    }

    return list.sum()
}

fun toNum(n: String): Int {
    return when (n) {
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> -99999
    }
}