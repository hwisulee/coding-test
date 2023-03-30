fun main(args: Array<String>) {
    println(solution(arrayOf("aya", "yee", "u", "maa", "wyeoo")))
}

fun solution(babbling: Array<String>): Int {
    var answer = babbling.map {
        it.replace("aya", ".")
            .replace("ye", ".")
            .replace("woo", ".")
            .replace("ma", ".")
    }.count {
        it.all { c ->
            c == '.'
        }
    }
    return answer
}