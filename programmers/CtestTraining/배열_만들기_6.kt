fun main(args: Array<String>) {
    println(solution(intArrayOf(0, 1, 1, 0)))
}

fun solution(arr: IntArray): IntArray {
    var stk = intArrayOf().toMutableList()
    var i = 0

    while (true) {
        if (i < arr.size) {
            if (stk.isEmpty()) {
                stk.add(arr[i])
            } else {
                if (stk[stk.lastIndex] == arr[i]) stk.removeAt(stk.lastIndex) else stk.add(arr[i])
            }
        }

        if (i > arr.size) break

        i++
    }

    return if (stk.isNotEmpty()) stk.toIntArray() else intArrayOf(-1)
}