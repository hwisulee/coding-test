import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val str = arrayOf(
    "\"재귀함수가 뭔가요?\"",
    "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
    "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
    "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val sb = StringBuilder()
    sb.appendLine("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    recursion(n, 0, sb)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun recursion(cnt: Int, depth: Int, sb: StringBuilder) {
    if (cnt == depth) {
        printUnder(depth, sb)
        sb.appendLine("\"재귀함수가 뭔가요?\"")
        printUnder(depth, sb)
        sb.appendLine("\"재귀함수는 자기 자신을 호출하는 함수라네\"")
    } else {
        for (i in str.indices) {
            printUnder(depth, sb)
            sb.appendLine(str[i])
        }

        recursion(cnt, depth + 1, sb)
    }

    printUnder(depth, sb)
    sb.appendLine("라고 답변하였지.")
}

fun printUnder(n: Int, sb: StringBuilder) = repeat(n) { sb.append("____") }