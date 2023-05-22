fun main(args: Array<String>) {
    val case = readln().toInt()
    var answer = intArrayOf()

    for (i in 0 until case) {
        answer += readln().split(" ").map { it.toInt() }.sum()
    }
    
    for (i in answer.indices) {
        println(answer[i])
    }
}