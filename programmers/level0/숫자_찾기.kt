fun main(args: Array<String>) {
    println(solution(29183, 1))
}

fun solution(num: Int, k: Int): Int {
    return if (num.toString().indexOfFirst { it.digitToInt() == k } != -1) {
        num.toString().indexOfFirst { it.digitToInt() == k } + 1
    } else {
        -1
    }
}