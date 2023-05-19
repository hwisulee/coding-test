fun main(args: Array<String>) {
    var answer = readln().split(" ").map { it.toInt() }.toMutableList()
    val timeToReady = readln().toInt()

    answer[1] += timeToReady

    while (answer[1] >= 60) {
        answer[1] -= 60
        answer[0] += 1
    }

    if (answer[0] >= 24) answer[0] = answer[0] % 24

    println(answer.joinToString(" "))
}