import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    val t = readLine()
    val arr = IntArray(2) { 0 }.also { 
        it[0] = s.length
        it[1] = t.length
    }
    val gcd = arr[0] * arr[1] / gcd(arr[0], arr[1])
    val result = if (s.repeat(gcd / arr[0]) == t.repeat(gcd / arr[1])) "1" else "0"
    
    bw.write(result)
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a