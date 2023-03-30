fun main(args: Array<String>) {
    println(solution(arrayOf("meosseugi", "1234"), arrayOf(arrayOf("rardss", "123"), arrayOf("yyoom", "1234"), arrayOf("meosseugi", "1234"))))
}

fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
    var answer: String = ""

    for (i in db.indices) {
        if (db[i][0] == id_pw[0]) {
            return if (db[i][1] == id_pw[1]) {
                "login"
            } else {
                "wrong pw"
            }
        }
    }

    return "fail"
}