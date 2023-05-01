fun main(args: Array<String>) {
    println(solution("ABBAA", "AABB"))
}

fun solution(myString: String, pat: String): Int = if (myString.replace("A", "0").replace("B", "A").replace("0", "B").contains(pat)) 1 else 0