fun main(args: Array<String>) {
    println(solution("3 + 4"))
}

fun solution(my_string: String): Int = my_string.replace("- ".toRegex(), "-").replace("[+] ".toRegex(), "").trim().split(" ".toRegex()).sumOf { it.toInt() }