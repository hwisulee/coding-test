import java.time.LocalDate

fun main(args: Array<String>) {
    println(solution(intArrayOf(2021, 12, 28), intArrayOf(2021, 12, 29)))
}

fun solution(date1: IntArray, date2: IntArray): Int {
    val date1 = LocalDate.of(date1[0], date1[1], date1[2])
    val date2 = LocalDate.of(date2[0], date2[1], date2[2])
    val compare = date1.compareTo(date2)

    return if (compare < 0) 1 else 0
}