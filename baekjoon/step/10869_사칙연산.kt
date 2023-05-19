fun main(args: Array<String>) {
    var answer = readln().split(" ")
    println("${answer.sumOf { it.toInt() }}\n${answer[0].toInt() - answer[1].toInt()}\n${answer[0].toInt() * answer[1].toInt()}\n${answer[0].toInt() / answer[1].toInt()}\n${answer[0].toInt() % answer[1].toInt()}")
}