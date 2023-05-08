fun main(args: Array<String>) {
    println(solution(3, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
}

fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
    return when (n) {
        1 -> num_list.sliceArray(0 .. slicer[1])
        2 -> num_list.sliceArray(slicer[0] .. num_list.lastIndex)
        3 -> num_list.sliceArray(slicer[0] .. slicer[1])
        4 -> num_list.slice(slicer[0] .. slicer[1] step slicer[2]).toIntArray()
        else -> { intArrayOf(-1) }
    }
}