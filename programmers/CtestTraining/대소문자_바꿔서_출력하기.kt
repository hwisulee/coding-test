fun main(args: Array<String>) {
    val s1 = readLine()!!

    println(s1.indices.joinToString("") { if (s1[it].isUpperCase()) s1[it].lowercase() else s1[it].uppercase() })
}