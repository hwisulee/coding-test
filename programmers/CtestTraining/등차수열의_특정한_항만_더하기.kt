fun main(args: Array<String>) {
    println(solution(3, 4, booleanArrayOf(true, false, false, true, true)))
}

fun solution(a: Int, d: Int, included: BooleanArray): Int = included.indices.mapIndexed { index, i -> if (included[index]) i * d + a else 0 }.sum()