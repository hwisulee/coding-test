fun main(args: Array<String>) {
    println(solution(100))
}

fun solution(chicken: Int): Int {
    var answer: Int = 0
    var coupon: Int = chicken

    while (coupon >= 10) {
        answer += coupon / 10
        coupon = (coupon % 10) + (coupon / 10)
    }

    return answer
}