fun main(args: Array<String>) {
    val a = readln().toInt()
    val b = readln()
    val bSplit = b.chunked(1).map { it.toInt() }

    println(a * bSplit[2])
    println(a * bSplit[1])
    println(a * bSplit[0])
    println(a * b.toInt())
}