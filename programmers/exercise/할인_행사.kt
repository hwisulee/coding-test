fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
    var answer: Int = 0
    val arr = number.copyOf()
    val newMap = mutableMapOf<String, Int>()

    repeat(want.size) { newMap[want[it]] = it }

    for ((i, item) in discount.withIndex()) {
        if (i >= 10) {
            val temp = discount[i - 10]
            val index = newMap[temp]
            if (index != null) arr[index]++
        }

        val index = newMap[item] ?: continue
        arr[index]--

        if (arr.none { it > 0 }) answer++
    }

    return answer
}