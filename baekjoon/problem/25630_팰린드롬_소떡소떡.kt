import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine()
    val st = readLine()
    var cnt = 0
    
    val arr = Array(2) { "" }
    if (st.length % 2 != 0) {
        arr[0] = st.slice(0 .. st.length / 2)
        arr[1] = st.slice(st.length / 2 until st.length).reversed()
        arr[0].forEachIndexed { index, c -> 
            if (c != arr[1][index]) cnt++
        }

    } else {
        arr[0] = st.slice(0 until st.length / 2)
        arr[1] = st.slice(st.length / 2 until st.length).reversed()
        arr[0].forEachIndexed { index, c ->
            if (c != arr[1][index]) cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}