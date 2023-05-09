fun main(args: Array<String>) {
    println(solution("ihrhbakrfpndopljhygc", 4, 2))
}

fun solution(my_string: String, m: Int, c: Int): String = my_string.chunked(m).indices.joinToString("") { i -> my_string.chunked(m)[i].filterIndexed { index, a -> index == c - 1 } }