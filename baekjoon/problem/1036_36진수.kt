
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

lateinit var max: BigInteger
lateinit var arr: Array<String>
val dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
var str = ""
val dic = mutableMapOf<Char, BigInteger>()
val thirtysix = BigInteger("36")

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    arr = Array(n) { readLine() }

    val k = readLine().toInt()
    if (k > 0) {
        check(arr)
        val list = dic.entries.sortedByDescending { it.value }
        str = list.take(k).joinToString("") { it.key.toString() }
    }
    max = sum(arr)
    val answer = change36(max)
    println(answer.reversed())

    bw.flush()
    bw.close()
}

fun check(arr: Array<String>) {
    for (n in arr.indices) {
        for (j in arr[n].indices) {
            val pow = thirtysix.pow(arr[n].length - j - 1)
            var bnum = BigInteger.valueOf(35).multiply(pow)
            val original = pow.multiply(BigInteger.valueOf(dchar.indexOf(arr[n][j]).toLong()))
            bnum = bnum.subtract(original)
            val c = arr[n][j]
            dic[c] = dic.getOrDefault(c, BigInteger.ZERO).add(bnum)
        }
    }
}

fun sum(arr: Array<String>): BigInteger {
    var result = BigInteger.ZERO
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            val c = arr[i][j].toString()
            val pow = thirtysix.pow(arr[i].length - j - 1)
            val num = if (str.contains(c)) {
                pow.multiply(BigInteger.valueOf(35))
            } else {
                pow.multiply(BigInteger.valueOf(dchar.indexOf(c).toLong()))
            }
            result = result.add(num)
        }
    }
    return result
}

fun change36(num: BigInteger): String {
    var localNum = num
    var result = ""
    if (localNum == BigInteger.ZERO) {
        result += "0"
    } else {
        while (localNum > BigInteger.ZERO) {
            result += dchar[localNum.remainder(thirtysix).toInt()]
            localNum = localNum.divide(thirtysix)
        }
    }
    return result
}