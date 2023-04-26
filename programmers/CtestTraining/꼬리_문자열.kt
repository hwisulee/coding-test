fun main(args: Array<String>) {
    println(solution(arrayOf("abc", "def", "ghi"), "ef"))
}

fun solution(str_list: Array<String>, ex: String): String = str_list.filterNot { it.contains(ex) }.joinToString("")