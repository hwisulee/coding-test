import kotlin.math.sqrt

var primeList = mutableListOf<Int>()

class Solution {
    fun solution(numbers: String): Int {
        val numList = numbers.chunked(1).map { it.toInt() }.toIntArray()
        permutation(0, 0, BooleanArray(numList.size), numList, mutableListOf())

        return primeList.distinct().count()
    }

    fun permutation(cur: Int, cnt: Int, visited: BooleanArray, arr: IntArray, list: MutableList<Int>) {
        if (cnt <= arr.size) {
            val temp = list.joinToString("")
            if (temp.isNotEmpty() && isPrime(temp.toInt())) primeList.add(temp.toInt())
        }

        for (i in arr.indices) {
            if (visited[i]) continue

            visited[i] = true
            list.add(arr[i])
            permutation(cur, cnt + 1, visited, arr, list)
            list.removeAt(list.lastIndex)
            visited[i] = false
        }
    }

    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false
        return (2 .. sqrt(n.toDouble()).toInt()).none { n % it == 0 }
    }
}