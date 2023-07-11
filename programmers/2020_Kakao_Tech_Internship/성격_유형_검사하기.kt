class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val hashMap = HashMap<String, Int>()
        hashMapInit(hashMap)

        repeat(survey.size) {
            val str = getScore(survey[it], choices[it]).split(" ")
            
            if (str[0] != "X") {
                hashMap[str[0]] = hashMap[str[0]]!! + str[1].toInt()
            }
        }

        return getAnswer(hashMap)
    }

    fun getScore(surveyOf: String, choice: Int): String {
        val (A, B) = surveyOf.chunked(1)
        var score = 0
        when (choice) {
            1, 7 -> score += 3
            2, 6 -> score += 2
            3, 5 -> score += 1
        }

        return if (choice == 4) "X $score" else if (choice < 4) "$A $score" else "$B $score"
    }

    fun hashMapInit(hashMap: HashMap<String, Int>) {
        hashMap["R"] = 0
        hashMap["T"] = 0
        hashMap["C"] = 0
        hashMap["F"] = 0
        hashMap["J"] = 0
        hashMap["M"] = 0
        hashMap["A"] = 0
        hashMap["N"] = 0
    }

    fun getAnswer(hashMap: HashMap<String, Int>): String {
        val sb = StringBuilder()

        if (hashMap["R"]!! >= hashMap["T"]!!) sb.append("R") else sb.append("T")
        if (hashMap["C"]!! >= hashMap["F"]!!) sb.append("C") else sb.append("F")
        if (hashMap["J"]!! >= hashMap["M"]!!) sb.append("J") else sb.append("M")
        if (hashMap["A"]!! >= hashMap["N"]!!) sb.append("A") else sb.append("N")

        return sb.toString()
    }
}