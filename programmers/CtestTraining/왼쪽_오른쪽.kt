fun main(args: Array<String>) {
    println(solution(arrayOf("u", "u", "o", "u")))
}

fun solution(str_list: Array<String>): Array<String> {
    var answer = str_list.indexOfFirst { it == "l" || it == "r" }

    return if (answer == -1) {
        emptyArray()
    } else if (str_list[answer] == "l") {
        str_list.sliceArray(0 until answer)
    } else {
        str_list.sliceArray(answer + 1 until  str_list.size)
    }
}