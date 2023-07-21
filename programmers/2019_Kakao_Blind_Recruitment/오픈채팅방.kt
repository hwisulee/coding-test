class Solution {
    fun solution(record: Array<String>): Array<String> {
        val userMap = mutableMapOf<String, String>()
        repeat(record.size) {
            val temp = record[it].split(" ")
            when (temp[0]) { "Enter", "Change" -> userMap[temp[1]] = temp[2] }
        }

        val system = record.map {
            val temp = it.split(" ")
            when (temp[0]) {
                "Enter" -> "${userMap[temp[1]]}님이 들어왔습니다."
                "Leave" -> "${userMap[temp[1]]}님이 나갔습니다."
                else -> ""
            }
        }.filter { it != "" }.toTypedArray()

        return system
    }
}