fun main(args: Array<String>) {
    println(solution("banana"))
}

fun solution(my_string: String): Array<String> = my_string.indices.map { i -> my_string.substring(i) }.sorted().toTypedArray()