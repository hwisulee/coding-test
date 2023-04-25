fun main(args: Array<String>) {
    println(solution(arrayOf("cafelatte", "americanoice", "hotcafelatte", "anything")))
}

fun solution(order: Array<String>): Int = order.map { if (it.contains("americano") || it.contains("anything")) 4500 else 5000 }.sum()