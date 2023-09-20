fun main() = with(System.`in`.bufferedReader()) {
    val arr = mutableListOf<Int>()
    repeat(9) { arr += readLine().toInt() }

    val sum = arr.sum()
    val sb = StringBuilder()
    for (i in 0 .. 8) {
        for (j in i + 1 .. 8) {
            if (sum - (arr[i] + arr[j]) == 100) {
                arr.removeAt(j)
                arr.removeAt(i)
                arr.sorted().forEach { println(it) }
                return
            }
        }
    }
}