fun main(args: Array<String>) {
    println(solution("aaaaa", "bbbbb"))
}

fun solution(str1: String, str2: String): String  = str1.indices.joinToString("") { "${str1[it]}${str2[it]}" }