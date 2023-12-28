import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Node(val num: Int, val gold: Int, val silver: Int, val bronze: Int, var rate: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = ArrayList<Node>()
    var result = 0
    repeat(n) {
        val (num, gold, silver, bronze) = readLine().split(" ").map { it.toInt() }
        list += Node(num, gold, silver, bronze, 0)
    }

    list.sortWith(compareByDescending<Node> { it.gold }.thenComparing { o1, o2 -> if (o1.gold == o2.gold) if (o1.silver == o2.silver) o2.bronze - o1.bronze else o2.silver - o1.silver else o2.gold - o1.gold })
    list[0].rate = 1

    for (i in 1 until list.size) {
        val prev = list[i - 1]
        val cur = list[i]
        if (cur.num == k) result = i
        if (cur.gold == prev.gold && cur.silver == prev.silver && cur.bronze == prev.bronze) cur.rate = prev.rate else cur.rate = i + 1
    }

    bw.write("${list[result].rate}")
    bw.flush()
    bw.close()
}