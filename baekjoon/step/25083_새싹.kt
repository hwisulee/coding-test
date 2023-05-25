import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(
        "         ,r'\"7\n" +
            "r`-_   ,'  ,/\n" +
            " \\. \". L_r'\n" +
            "   `~\\/\n" +
            "      |\n" +
            "      |"
    )

    bw.flush()
    bw.close()
}