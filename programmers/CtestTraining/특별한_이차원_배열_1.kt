fun main(args: Array<String>) {
    println(solution(3))
}

fun solution(n: Int): Array<IntArray> {
    var arr = Array(n) { IntArray(n) }

    return arr.indices.map { i -> arr[i].indices.map { j -> if (i == j) 1 else 0 }.toIntArray() }.toTypedArray()
}