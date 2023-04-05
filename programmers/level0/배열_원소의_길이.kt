fun main(args: Array<String>) {
    println(solution(arrayOf("We", "are", "the", "world!")))
}

fun solution(strlist: Array<String>): IntArray = strlist.map { it.length }.toIntArray()