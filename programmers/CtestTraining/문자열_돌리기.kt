fun main(args: Array<String>) {
    val s1 = readLine()!!

    println(s1.indices.joinToString("") { "${s1[it]}\n" })
}