fun main(args: Array<String>) {
    println(solution(intArrayOf(3, 7, 2, 5, 4, 6, 1), booleanArrayOf(false, true, true, true, true, false, false)))
}

fun solution(rank: IntArray, attendance: BooleanArray): Int {
    var temp = rank.sorted().mapIndexed { index, i -> if (attendance[rank.indexOf(i)]) rank.indexOf(i) else -1 }.filter { it != -1 }

    return (10000 * temp[0]) + (100 * temp[1]) + temp[2]
}