import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val morseChar = mapOf(
        Pair('A', ".-"), Pair('B', "-..."), Pair('C', "-.-."), Pair('D', "-.."), Pair('E', "."),
        Pair('F', "..-."), Pair('G', "--."), Pair('H', "...."), Pair('I', ".."), Pair('J', ".---"),
        Pair('K', "-.-"), Pair('L', ".-.."), Pair('M', "--"), Pair('N', "-."), Pair('O', "---"),
        Pair('P', ".--."), Pair('Q', "--.-"), Pair('R', ".-."), Pair('S', "..."), Pair('T', "-"),
        Pair('U', "..-"), Pair('V', "...-"), Pair('W', ".--"), Pair('X', "-..-"), Pair('Y', "-.--"),
        Pair('Z', "--..")
    )

    val morseNumber = mapOf(
        Pair(0, "-----"), Pair(1, ".----"), Pair(2, "..---"), Pair(3, "...--"), Pair(4, "....-"),
        Pair(5, "....."), Pair(6, "-...."), Pair(7, "--..."), Pair(8, "---.."), Pair(9, "----.")
    )

    val morseSymbol = mapOf(
        Pair(',', "--..--"), Pair('.', ".-.-.-"), Pair('?', "..--.."), Pair(':', "---..."), Pair('-', "-....-"),
        Pair('@', ".--.-.")
    )

    val n = readLine().toInt()
    val morse = readLine().split(" ").map {
        when (it.length) {
            6 -> morseSymbol.entries.find { map -> map.value == it }?.key
            5 -> morseNumber.entries.find { map -> map.value == it }?.key
            else -> morseChar.entries.find { map -> map.value == it }?.key
        }
    }

    bw.write(morse.joinToString(""))
    bw.flush()
    bw.close()
}