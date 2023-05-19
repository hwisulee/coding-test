fun main(args: Array<String>) {
    val answer = readln().split(" ").map { it.toInt() }
    if (answer[0] >= answer[1]) if (answer[0] == answer[1]) println("==") else println(">") else println("<")
}