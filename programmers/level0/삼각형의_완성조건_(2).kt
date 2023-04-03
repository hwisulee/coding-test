fun main(args: Array<String>) {
    println(solution(intArrayOf(3, 6)))
}

fun solution(sides: IntArray): Int {
    var answer: Int = 0
    var i = 0

    while (true) {
        if (sides.maxOf { it } < sides.minOf { it } + i && sides.maxOf { it } >= i) answer++
        if (i > sides.maxOf { it }) break
        i++
    }

    while (true) {
        if (i >= sides.sumOf { it }) break
        if (i > sides.maxOf { it }) answer++
        i++
    }

    return answer
}