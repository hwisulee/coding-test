fun main(args: Array<String>) {
    val x = readln().toInt()
    val y = readln().toInt()
    when {
        x > 0 && y > 0 -> println(1)
        x < 0 && y > 0 -> println(2)
        x < 0 && y < 0 -> println(3)
        x > 0 && y < 0 -> println(4)
        else -> println(-1)
    }
}