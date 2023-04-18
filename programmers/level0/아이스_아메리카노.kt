fun main(args: Array<String>) {
    println(solution(5500))
}

fun solution(money: Int): IntArray = intArrayOf((money / 5500), (money % 5500))