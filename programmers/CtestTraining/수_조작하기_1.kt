fun main(args: Array<String>) {
    println(solution(0, "wsdawsdassw"))
}

fun solution(n: Int, control: String): Int {
    var answer: Int = n

    for (i in control.indices) {
        when (control[i]) {
            'w' -> answer += 1
            's' -> answer -= 1
            'd' -> answer += 10
            else -> answer -= 10
        }
    }

    return answer
}