fun main(args: Array<String>) {
    println(solution(arrayOf("problemsolving", "practiceguitar", "swim", "studygraph"), booleanArrayOf(true, false, true, false)))
}

fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> = todo_list.filterIndexed { index, s -> !finished[index] }.toTypedArray()