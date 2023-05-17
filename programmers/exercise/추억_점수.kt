fun main(args: Array<String>) {
    println(solution(arrayOf("may", "kein", "kain", "radi"), intArrayOf(5, 10, 1, 3), arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))))
}

fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    photo.indices.map { i -> photo[i].indices.map { j -> name.indices.forEach { if (photo[i][j] == name[it]) photo[i][j] = yearning[it].toString() } } }

    return photo.indices.map { i -> photo[i].filter { it.matches("[0-9]*$".toRegex()) }.sumOf { it.toInt() } }.toIntArray()
}