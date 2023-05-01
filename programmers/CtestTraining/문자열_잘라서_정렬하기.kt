fun main(args: Array<String>) {
    println(solution("axbxcxdx"))
}

fun solution(myString: String): Array<String> = myString.split("x").filter { it.isNotEmpty() }.sorted().toTypedArray()