import kotlin.math.ceil

data class Record(val time: String, val user: String, val io: String)
data class Userfees(val user: String, val fees: Int)

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        val arr = mutableListOf<Record>()
        repeat(records.size) {
            val strTemp = records[it].split(" ")
            arr.add(Record(strTemp[0], strTemp[1], strTemp[2]))
        }

        val recordGroup = arr.groupBy { it.user }
        val userArr = arr.groupBy { it.user }.keys
        val userFees = mutableListOf<Userfees>()

        for (user in userArr) {
            var timeList = arrayOf<String>()
            recordGroup[user]!!.forEach { timeList += it.time }

            if (timeList.size % 2 != 0) timeList += "23:59"

            var userTime = 0

            for (i in timeList.indices) {
                if (i % 2 != 0) {
                    val outTime = timeList[i].split(":").map { it.toInt() }
                    val inTime = timeList[i - 1].split(":").map { it.toInt() }

                    userTime += if (outTime[1] - inTime[1] < 0) {
                        ((outTime[0] - 1) - inTime[0]) * 60 + ((outTime[1] + 60) - inTime[1])
                    } else {
                        (outTime[0] - inTime[0]) * 60 + (outTime[1] - inTime[1])
                    }
                }
            }

            var newFees = fees[1] + ceil(((userTime - fees[0]).toDouble() / fees[2].toDouble())).toInt() * fees[3]
            if (newFees < fees[1]) newFees = fees[1]

            userFees.add(Userfees(user, newFees))
        }

        userFees.sortedBy { it.user.toInt() }.forEach { answer += it.fees }
        return answer
    }
}