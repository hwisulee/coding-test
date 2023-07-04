import kotlin.math.min

class Solution {
    fun solution(X: String, Y: String): String {
        val x = X.chunked(1).groupingBy { it }.eachCount()
        val y = Y.chunked(1).groupingBy { it }.eachCount()
        val sb = StringBuilder()

        x.keys.intersect(y.keys).associateWith { min(x[it]!!, y[it]!!) }.toSortedMap(Comparator.reverseOrder())
            .map { (key, value) -> 
                repeat(value) { sb.append(key) }
        }

        return if (sb.startsWith("0")) "0" else sb.ifEmpty { "-1" }.toString()
    }
}