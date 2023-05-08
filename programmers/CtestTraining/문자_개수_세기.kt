fun main(args: Array<String>) {
    println(solution("Programmers"))
}

fun solution(my_string: String): IntArray {
    var answer: IntArray = IntArray(('A'..'z').filter { it.isLetter() }.size)

    for ((index, i) in ('A' .. 'z').filter { it.isLetter() }.withIndex()) {
        for (j in my_string.indices) {
            if (my_string[j] == i) {
                answer[index] += 1
            }
        }
    }

    return answer
}