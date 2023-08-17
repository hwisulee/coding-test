import java.util.*

fun main() = with(System.`in`.bufferedReader()){
    var st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val tomato = Array(m+2){Array(n+2){-1} }
    var count = -1
    var queue = arrayListOf<Pair<Int,Int>>()

    for(i in 1 until m+1){
        st = StringTokenizer(readLine())
        for(j in 1 until n+1){
            tomato[i][j] = st.nextToken().toInt()
        }
    }

    for(i in 1 until m+1){
        for(j in 1 until n+1){
            if(tomato[i][j] == 1){
                queue.add(Pair(i,j))
            }
        }
    }

    while(queue.isNotEmpty()) {
        count++
        val tmp = arrayListOf<Pair<Int,Int>>()
        tmp.addAll(queue)
        queue = arrayListOf()

        for(q in 0 until tmp.size){
            val i = tmp[q].first
            val j = tmp[q].second
            if (tomato[i][j - 1] == 0) {
                tomato[i][j - 1] = 1
                queue.add(Pair(i,j-1))
            }
            if (tomato[i][j + 1] == 0) {
                tomato[i][j + 1] = 1
                queue.add(Pair(i,j+1))
            }
            if (tomato[i - 1][j] == 0) {
                tomato[i - 1][j] = 1
                queue.add(Pair(i-1,j))
            }
            if (tomato[i + 1][j] == 0) {
                tomato[i + 1][j] = 1
                queue.add(Pair(i+1,j))
            }
        }
    }

    for (i in 1 until m+1){
        for(j in 1 until n+1){
            if(tomato[i][j] == 0) {
                println(-1)
                return
            }
        }
    }

    println(count)
}