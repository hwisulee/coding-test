fun main(args: Array<String>) {
    println(solution(arrayOf("mumu", "soe", "poe", "kai", "mine"), arrayOf("kai", "kai", "mine", "mine")))
}

fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    var rankMap : HashMap<String, Int> = hashMapOf()

    for (i in players.indices) {
        rankMap[players[i]] = i
    }

    for (i in callings) {
        var callRank = rankMap[i]
        var frontPlayer = players[callRank!! - 1]

        players[callRank - 1] = i
        players[callRank] = frontPlayer

        rankMap[i] = callRank - 1
        rankMap[frontPlayer] = callRank
    }

    return players
}