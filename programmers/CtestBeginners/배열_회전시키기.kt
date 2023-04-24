fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3), "right"))
}

fun solution(numbers: IntArray, direction: String): IntArray {
    var answer: IntArray
    val temp = numbers.toMutableList()

    answer = if (direction == "left") {
        temp.removeAt(0)
        temp.add(numbers[0])
        temp.toIntArray()
    } else {
        temp.add(0, numbers[numbers.lastIndex])
        temp.removeAt(temp.lastIndex)
        temp.toIntArray()
    }

    return answer
}