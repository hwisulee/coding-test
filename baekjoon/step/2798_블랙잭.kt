import java.io.*

var result = 0

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val card = br.readLine().split(" ").map { it.toInt() }

    combination(card, mutableListOf(), 0, 3, 0, m)

    bw.write("$result")
    bw.flush()
    bw.close()
}

fun combination(cardList: List<Int>, temp: MutableList<Int>, cnt: Int, depth: Int, start: Int, m: Int) {
    if (cnt == depth) {
        if (temp.sum() in (result + 1)..m) {
            result = temp.sum()
        }
    } else {
        for (i in start until cardList.size) {
            temp.add(cardList[i])
            combination(cardList, temp, cnt + 1, depth, i + 1, m)
            temp.removeAt(temp.lastIndex)
        }
    }
}