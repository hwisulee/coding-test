import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var sum = 0.0
    var credit = 0.0

    while (true) {
        try {
            val subject = br.readLine().split(" ")

            if (subject.isEmpty()) break
            if (subject[2] != "P") {
                credit += subject[1].toDouble()

                when (subject[2]) {
                    "A+" -> sum += 4.5 * subject[1].toDouble()
                    "A0" -> sum += 4.0 * subject[1].toDouble()
                    "B+" -> sum += 3.5 * subject[1].toDouble()
                    "B0" -> sum += 3.0 * subject[1].toDouble()
                    "C+" -> sum += 2.5 * subject[1].toDouble()
                    "C0" -> sum += 2.0 * subject[1].toDouble()
                    "D+" -> sum += 1.5 * subject[1].toDouble()
                    "D0" -> sum += 1.0 * subject[1].toDouble()
                    "F" -> sum += 0
                    else -> {}
                }
            }
        } catch (_: Exception) {
            break
        }
    }

    bw.write("${sum / credit}")
    bw.flush()
    bw.close()
}