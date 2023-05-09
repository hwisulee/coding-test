fun main(args: Array<String>) {
    println(solution("banana", "ana"))
}

fun solution(my_string: String, is_suffix: String): Int = if (my_string.indices.map { i -> my_string.substring(i) == is_suffix }.count { it } > 0) 1 else 0