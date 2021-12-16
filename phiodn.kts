fun phi(n: Int): Int {
    var n = n
    var result = n.toFloat()
    var p = 2
    while (p * p <= n) {

        if (n % p == 0) {
            // If yes, then update n and result
            while (n % p == 0) n /= p
            result *= (1.0 - 1.0 / p.toFloat()).toFloat()
        }
        ++p
    }
    if (n > 1) result *= (1.0 - 1.0 / n.toFloat()).toFloat()
    return result.toInt()
}

var n = 6
println(phi(n))