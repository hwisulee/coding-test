fun main(args: Array<String>) {
    val answer = readln().toInt()

    for (i in 1 .. 9) {
        println("$answer * $i = ${answer * i}")
    }
}