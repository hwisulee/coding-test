fun main(args: Array<String>) {
    var answer = readln().split(" ").map { it.toInt() }
    println((answer[0] + answer[1]) % answer[2])
    println(((answer[0] % answer[2]) + (answer[1] % answer[2])) % answer[2])
    println((answer[0] * answer[1]) % answer[2])
    println(((answer[0] % answer[2]) * (answer[1] % answer[2])) % answer[2])
}