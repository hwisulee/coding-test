fun main(args: Array<String>) {
    println(solution(arrayOf("a", "bc", "d", "efg", "hi")))
}

fun solution(strArr: Array<String>): Int = strArr.groupBy { it.length }.maxOf { it.value.size }