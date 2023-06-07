import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val tree = IntArray(br.readLine().toInt()) { br.readLine().toInt() }
    val distance = IntArray(tree.size - 1) { 0 }
    repeat(tree.size - 1) {
        distance[it] = tree[it + 1] - tree[it]
    }

    var g = gcd(distance[0], distance[1])
    for (i in 2 until distance.size) {
        g = gcd(g, distance[i])
    }

    bw.write("${distance.indices.sumOf { (distance[it] / g) - 1 }}")
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a