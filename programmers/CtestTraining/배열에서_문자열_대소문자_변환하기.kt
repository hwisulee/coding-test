fun main(args: Array<String>) {
    println(solution(arrayOf("AAA", "BBB", "CCC", "DDD")))
}

fun solution(strArr: Array<String>): Array<String> = strArr.mapIndexed { index, s -> if (index % 2 == 0) s.lowercase() else s.uppercase() }.toTypedArray()