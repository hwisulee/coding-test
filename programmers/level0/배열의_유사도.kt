fun main(args: Array<String>) {
    println(solution(arrayOf("a", "b", "c"), arrayOf("com", "b", "d", "p", "c")))
}

fun solution(s1: Array<String>, s2: Array<String>): Int = (s1.toList() + s2.toList()).groupBy { it }.filter { it.value.size > 1 }.flatMap { it.value }.distinct().count()