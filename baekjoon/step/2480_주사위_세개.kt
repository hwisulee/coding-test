fun main(args: Array<String>) {
    var answer = readln().split(" ").map { it.toInt() }
    val groupSize = answer.groupBy { it }.count()

    when (groupSize) {
        1 -> println(10000 + answer[0] * 1000)
        2 -> println(1000 + answer.groupBy { it }.filter { it.value.size >= 2 }.values.maxOf { it.max() } * 100)
        3 -> println(answer.max() * 100)
    }
}