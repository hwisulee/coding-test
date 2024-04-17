import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().also {
        val (month, day, year, time) = it.split(" ")
        val leapYearMonth = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        if (isLeapYear(year.toInt())) {
            bw.write("%.9f".format(
                toNow(leapYearMonth, monthToInt(month), day.removeSuffix(",").toInt() - 1, time.split(":").map { it.toInt() }) * 100))
        } else {
            leapYearMonth[1] = 28
            bw.write("%.9f".format(toNow(leapYearMonth, monthToInt(month), day.removeSuffix(",").toInt() - 1, time.split(":").map { it.toInt() }) * 100))
        }

    }
    bw.flush()
    bw.close()
}

fun isLeapYear(year: Int): Boolean {
    return if (year % 4 == 0) {
        if (year % 400 == 0 && year % 100 == 0) true
        else if (year % 400 == 0 && year % 100 != 0) true
        else !(year % 400 != 0 && year % 100 == 0)
    } else {
        false
    }
}

fun toNow(year: IntArray, month: Int, day: Int, time: List<Int>): Double {
    val dayToSec = 60 * 60 * 24
    var sec = 0

    for (i in 0 until month - 1) {
        sec += dayToSec * year[i]
    }

    sec += dayToSec * day
    sec += time[0] * 3600 + time[1] * 60

    return sec.toDouble() / (year.sum().toDouble() * dayToSec.toDouble())
}

fun monthToInt(month: String): Int {
    return when (month) {
        "January" -> 1
        "February" -> 2
        "March" -> 3
        "April" -> 4
        "May" -> 5
        "June" -> 6
        "July" -> 7
        "August" -> 8
        "September" -> 9
        "October" -> 10
        "November" -> 11
        else -> 12
    }
}