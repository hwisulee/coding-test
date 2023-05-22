fun main(args: Array<String>) {
    val allCost = readln().toInt()
    var case = readln().toInt()

    for (i in 0 until case) {
        if (i == 0 && case != 0) case = 0
        case += readln().split(" ").map { it.toInt() }.let { it[0] * it[1] }
    }

    if (allCost == case) println("Yes") else println("No")
}