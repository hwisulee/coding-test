fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    
    val sb = StringBuilder()
    for (i in 1 .. b) {
        for (j in 1 .. a) {
            sb.append("*")
        }
        sb.append("\n")
    }
    println(sb.toString())
}