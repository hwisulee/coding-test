import java.io.BufferedWriter
import java.io.OutputStreamWriter

var numList = mutableListOf<String>()

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = (1 .. n).map { it }

    permutation(0, m, BooleanArray(arr.size), arr, mutableListOf())
    numList.forEach{ bw.appendLine(it) }
    bw.flush()
    bw.close()
}

fun permutation(cnt: Int, depth: Int, visited: BooleanArray, arr: List<Int>, list: MutableList<Int>) {
    if (list.size == depth) {
        val temp = list.joinToString(" ")
        numList += temp
    }

    for (i in arr.indices) {
        if (visited[i]) continue

        visited[i] = true
        list.add(arr[i])
        permutation(cnt, depth, visited, arr, list)
        list.removeAt(list.lastIndex)
        visited[i] = false
    }
}