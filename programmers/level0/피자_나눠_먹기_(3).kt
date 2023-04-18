fun main(args: Array<String>) {
    println(solution(4, 12))
}

fun solution(slice: Int, n: Int): Int {
    var answer: Int = 0

    answer += n / slice

    if ((n % slice) < slice && n % slice != 0) {
        answer +=1
    }

    return answer
}