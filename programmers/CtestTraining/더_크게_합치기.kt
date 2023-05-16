fun main(args: Array<String>) {
    println(solution(9, 91))
}

fun solution(a: Int, b: Int): Int = if ("$a$b".toInt() >= "$b$a".toInt()) "$a$b".toInt() else "$b$a".toInt()