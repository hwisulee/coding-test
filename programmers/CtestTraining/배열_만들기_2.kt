fun main(args: Array<String>) {
    println(solution(0, 1000))
}

fun solution(l: Int, r: Int): IntArray = (l..r).filter{ it.toString().none { it != '5' && it != '0' } }.toIntArray().let{if(it.isEmpty()) intArrayOf(-1) else it}