fun main(args: Array<String>) {
    println(solution(intArrayOf(49, 13), intArrayOf(70, 11, 2)))
}

fun solution(arr1: IntArray, arr2: IntArray): Int = if (arr1.size == arr2.size) if (arr1.sum() == arr2.sum()) 0 else if (arr1.sum() > arr2.sum()) 1 else -1 else if (arr1.size > arr2.size) 1 else -1