
import java.io.BufferedWriter
import java.io.OutputStreamWriter

val month = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

data class Info(val mm: String, val dd: String, val time: String, val obj: String, val name: String, val flag: Boolean)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, l, f) = readLine().split(" ")
    val reservedTime = toMinutes(l)

    val objInfo = mutableMapOf<String, Info>()
    val peopleFee = mutableMapOf<String, Long>()

    repeat(n.toInt()) {
        val (date, time, obj, name) = readLine().split(" ")

        val mm = date.substring(5, 7)
        val dd = date.substring(8, 10)

        val key = obj + name
        if (objInfo[key]?.flag == true) {
            val info = objInfo[key]!!
            val used = feeCal(info.mm, info.dd, info.time, mm, dd, time)
            if (reservedTime < used) {
                peopleFee[name] = peopleFee.getOrDefault(name, 0L) + (used - reservedTime) * f.toLong()
            }
            objInfo.remove(key)
        } else {
            objInfo[key] = Info(mm, dd, time, obj, name, true)
        }
    }

    if (peopleFee.isEmpty()) {
        bw.write("-1")
    } else {
        val sortedPeopleFee = peopleFee.toList().sortedBy { it.first }
        for ((person, fee) in sortedPeopleFee) {
            bw.write("$person $fee\n")
        }
    }

    bw.flush()
    bw.close()
}

fun toMinutes(timeStr: String): Long {
    val day = timeStr.substring(0, 3).toLong()
    val hour = timeStr.substring(4, 6).toLong()
    val min = timeStr.substring(7, 9).toLong()
    return (day * 24 + hour) * 60 + min
}

fun feeCal(m: String, d: String, t: String, mm: String, dd: String, tt: String): Long {
    val t2 = tt.substring(0, 2).toLong() * 60 + tt.substring(3, 5).toLong()
    val t1 = t.substring(0, 2).toLong() * 60 + t.substring(3, 5).toLong()

    return if (m == mm) {
        val day = (dd.toLong() - d.toLong()) * 60 * 24
        day + (t2 - t1)
    } else {
        var day = 0L
        if (mm.toLong() - m.toLong() > 1) {
            for (i in (m.toLong() + 1) until mm.toLong()) {
                day += month[i.toInt()] * 60 * 24
            }
        }
        day += (dd.toLong() + (month[m.toInt()] - d.toLong())) * 60 * 24
        day + (t2 - t1)
    }
}
