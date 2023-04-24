fun main(args: Array<String>) {
    println(solution(arrayOf("p", "o", "s"), arrayOf("sod", "eocd", "qixm", "adio", "soo")))
}

fun solution(spell: Array<String>, dic: Array<String>): Int = if (dic.map { it.toList().sorted().joinToString("") }.contains(spell.sortedArray().joinToString(""))) 1 else 2