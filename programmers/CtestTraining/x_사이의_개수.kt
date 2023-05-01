fun main(args: Array<String>) {
    println(solution("oxooxoxxox"))
}

fun solution(myString: String): IntArray = myString.split("x").map { it.length }.toIntArray()