fun main(args: Array<String>) {
    val n = readln().toInt()

    println("${"long ".repeat((4..n step 4).count())}int")
}