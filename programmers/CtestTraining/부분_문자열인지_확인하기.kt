fun main(args: Array<String>) {
    println(solution("banana", "aba"))
}

fun solution(my_string: String, target: String): Int = if (my_string.contains(target)) 1 else 0