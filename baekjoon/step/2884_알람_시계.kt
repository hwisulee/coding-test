fun main(args: Array<String>) {
    var answer = readln().split(" ").map { it.toInt() }.toMutableList()

    answer[1] -= 45

    if (answer[0] == 0) answer[0] = 24

    if (answer[1] < 0) {
        answer[1] += 60
        answer[0] -= 1
    }

    if (answer[0] == 24) answer[0] = 0

    println(answer.joinToString(" "))
}