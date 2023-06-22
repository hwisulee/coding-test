class Solution {
    fun solution(new_id: String): String {
        var answer = new_id.toLowerCase()
            .replace("[^a-z0-9-_.]".toRegex(), "")
            .replace("[.]*[.]".toRegex(), ".")
            .removePrefix(".").removeSuffix(".")
            .let { if (it.isEmpty()) "a" else it }
            .let { if (it.length >= 16) it.substring(0, 15).removeSuffix(".") else it }
        
        if (answer.length <= 2) {
            val sb = StringBuilder()
            while (sb.length < 3 - answer.length) { sb.append(answer.last()) }
            answer += sb.toString()
        }
        return answer
    }
}