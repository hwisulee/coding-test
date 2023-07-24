class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        val a = HashSet<Int>()
        val b = HashSet<Int>()
        val toppingCnt = mutableMapOf<Int, Int>()

        topping.forEach {
            b.add(it)
            toppingCnt[it] = toppingCnt.getOrDefault(it, 0) + 1
        }

        repeat(topping.size) {
            a.add(topping[it])
            toppingCnt[topping[it]] = toppingCnt.getOrDefault(topping[it], 0) - 1

            if (toppingCnt.getOrDefault(topping[it], 0) <= 0) b.remove(topping[it])
            if (a.size == b.size) answer++
        }

        return answer
    }
}