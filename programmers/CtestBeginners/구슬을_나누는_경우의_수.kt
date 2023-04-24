import Factorial.factorial
import java.math.BigInteger

fun main(args: Array<String>) {
    println(solution(3, 2))
}

fun solution(balls: Int, share: Int): BigInteger {
    val factorial: (Int) -> BigInteger by lazy { {n: Int -> if (n <= 1) n.toBigInteger() else n.toBigInteger() * factorial(n - 1)} }
    return factorial(balls) / (factorial((balls - share)) * factorial(share))
}

object Factorial {
    lateinit var factorial: (n: Int) -> BigInteger

    init {
        factorial = { n -> if (n <= 1) n.toBigInteger() else n.toBigInteger() * factorial(n - 1) }
    }
}