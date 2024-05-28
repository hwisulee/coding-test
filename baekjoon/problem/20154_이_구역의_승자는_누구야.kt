import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = intArrayOf(3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2 ,2 ,2, 1)
    val input = readLine().map { arr[it - 'A'] }.toMutableList()
    
    bw.write(if (game(input)[0] % 2 == 1) "I'm a winner!" else "You're the winner?")
    bw.flush()
    bw.close()
}

fun game(input: MutableList<Int>): MutableList<Int> {
    val temp = mutableListOf<Int>()
    for (i in 1 until input.size step 2) {
        val cur = input[i - 1] + input[i]
        temp += if (cur >= 10) cur % 10 else cur
    }
    
    if (input.size % 2 != 0) temp += input.last()
    return if (temp.size == 1) temp else game(temp)
}