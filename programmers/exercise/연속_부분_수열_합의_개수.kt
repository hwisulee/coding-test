class Solution {
    fun solution(elements: IntArray): Int {
        var answer: Int = 0
        var list = List(elements.size * 2) { if (it == 0) 0 else { answer += elements[(it - 1) % elements.size]; answer} }
        var sets = mutableSetOf<Int>()
        
        for (i in 1 .. elements.size) {
            for (j in 0 until elements.size) {
                sets.add(list[j + i] - list[j])
            }
        }
        
        return sets.size
    }
}