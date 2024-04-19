import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = Array<ArrayList<String>>(n) { ArrayList() }
    var cnt = 0
    
    for (i in 0 until n) {
        arr[i] = ArrayList()
        val cur = readLine()
        
        for (j in cur.indices) {
            arr[i].add(cur.substring(j) + cur.substring(0, j))
        }

        var check = true
        for (j in 0 until i) {
            for (k in arr[j].indices) {
                if (cur == arr[j][k]) check = false
            }
        }
        
        if (check) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}