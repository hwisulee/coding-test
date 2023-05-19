fun main(args: Array<String>) {
    var answer = readln().split(" ")
    println(answer.sumOf { it.toInt() })
}