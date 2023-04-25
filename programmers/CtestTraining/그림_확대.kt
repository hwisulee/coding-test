fun main(args: Array<String>) {
    println(solution(arrayOf(".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."), 2))
}

fun solution(picture: Array<String>, k: Int): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    var temp = ""

    for (i in picture.indices) {
        for (j in picture[i].indices) {
            for (k in 0 until k) {
                temp += picture[i][j]
            }

        }
    }

    var arr = temp.chunked(picture[0].length * k)

    for (i in arr.indices) {
        for (j in 0 until k) {
            answer += arr[i]
        }
    }

    return answer
}