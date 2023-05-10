fun main(args: Array<String>) {
    println(solution("123"))
}

fun solution(number: String): Int = (number.toBigInteger().remainder("9".toBigInteger())).toInt()