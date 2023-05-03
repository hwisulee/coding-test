fun main(args: Array<String>) {
    println(solution("abstract algebra"))
}

fun solution(myString: String): String = myString.lowercase().replace("a", "A")