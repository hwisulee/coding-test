fun main(args: Array<String>) {
    val answer = readln().toInt()
    if (answer % 4 == 0 && answer % 100 != 0) println(1) else if(answer % 400 == 0) println(1) else println(0)
}