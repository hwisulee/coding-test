class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val arr = arrayOf("aya", "ye", "woo", "ma")

        babbling.forEach {
            var temp = it

            for (i in arr) {
                if (temp.contains(i + i)) continue
                else temp = temp.replace(i, " ")
            }

            if (temp.replace(" ", "") == "") answer++
        }
        
        return answer
    }
}