fun main(args: Array<String>) {
    println(solution(arrayOf("nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx")))
}

fun solution(names: Array<String>): Array<String> = names.toList().chunked(5).map { it[0] }.toTypedArray()