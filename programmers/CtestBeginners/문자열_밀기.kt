fun main(args: Array<String>) {
    println(solution("hello", "ohell"))
}

fun solution(A: String, B: String): Int {
    var answer: Int = 0

    var listA = A.toMutableList()
    var listB = B.toMutableList()

    for (i in A.indices) {
        if (listA == listB) return i

        listA.add(0, listA[listA.lastIndex])
        listA.removeAt(listA.lastIndex)
    }

    return -1
}