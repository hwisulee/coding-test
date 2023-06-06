import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr1 = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    val m = br.readLine().toInt()
    val arr2 = br.readLine().split(" ").map { it.toInt() }

    arr2.forEach {
        if (!arr1.add(it)) bw.append("1 ")
        else bw.append("0 ")
    }
    bw.flush()
    bw.close()
}