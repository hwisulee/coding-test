class Solution {
    fun solution(phone_number: String): String {
        var new = ""
        for (i in 0 until phone_number.length - 4) {
            new += "*"
        }

        return new + phone_number.slice(phone_number.length - 4 until phone_number.length)
    }
}