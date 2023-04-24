fun main(args: Array<String>) {
    println(solution(4, 4, 4, 4))
}

fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
    val denom3 = denom1 * denom2 / gcd(denom1, denom2)
    val numer3 = (denom3 / denom1) * numer1 + (denom3 / denom2) * numer2
    var gcd = 0

    for (i in 1 .. denom3) {
        if (numer3 % i == 0 && denom3 % i == 0) {
            gcd = i
        }
    }

    return intArrayOf(numer3 / gcd, denom3 / gcd)
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a