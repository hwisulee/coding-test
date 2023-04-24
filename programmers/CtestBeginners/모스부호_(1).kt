fun main(args: Array<String>) {
    println(solution(".... . .-.. .-.. ---"))
}

fun solution(letter: String): String {
    var answer: String = ""

    var sp = letter.split(" ")
    var morse = arrayOf(
        ".-", "-...", "-.-.", "-..", ".", "..-.",
        "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--.."
    )

    for (i in sp.indices) {
        for (j in morse.indices) {
            if (sp[i] == morse[j]) answer += ('a' + j)
        }
    }

    return answer
}