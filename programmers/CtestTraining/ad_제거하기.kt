fun main(args: Array<String>) {
    println(solution(arrayOf("and", "notad", "abcd")))
}

fun solution(strArr: Array<String>): Array<String> = strArr.filterNot { it.contains("ad") }.toTypedArray()