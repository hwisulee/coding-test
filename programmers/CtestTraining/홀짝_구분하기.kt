fun main(args: Array<String>) {
    val a = readLine()

    if (a!!.toInt() % 2 == 0) {
        println("$a is even")
    } else {
        println("$a is odd")
    }
}