fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 4, 2, 5, 3)))
}

fun solution(arr: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    var i = 0
    while(i < arr.size) {
        if(answer.isEmpty()) answer = answer.plus(arr[i])
        else {
            if(answer[answer.lastIndex] >= arr[i]) {
                answer = answer.filterIndexed{i,v -> i != answer.lastIndex}.toIntArray()
                i--
            }
            else answer = answer.plus(arr[i])
        }
        i++
    }
    return if(answer.isEmpty()) intArrayOf(-1) else answer
}