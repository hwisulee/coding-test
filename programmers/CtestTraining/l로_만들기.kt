fun main(args: Array<String>) {
    println(solution("abcdevwxyz"))
}

fun solution(myString: String): String {
    return myString.replace("a", "l")
        .replace("b", "l")
        .replace("c", "l")
        .replace("d", "l")
        .replace("e", "l")
        .replace("f", "l")
        .replace("g", "l")
        .replace("h", "l")
        .replace("i", "l")
        .replace("j", "l")
        .replace("k", "l")
}