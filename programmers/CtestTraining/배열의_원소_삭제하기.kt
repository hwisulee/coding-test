fun main(args: Array<String>) {
    println(solution(intArrayOf(293, 1000, 395, 678, 94), intArrayOf(94, 777, 104, 1000, 1, 12)))
}

fun solution(arr: IntArray, delete_list: IntArray): IntArray {
    var mutable = arr.toMutableList()

    for (i in delete_list.indices) {
        arr.toMutableList().remove(delete_list[i])
    }

    return mutable.toIntArray()
}