abstract class Lik {
    abstract fun povrsina(): Double
    abstract fun opseg(): Double
}

class Rectangle : Lik() {
    var a = 5.0
    var b = 4.0
    override fun povrsina(): Double {
        return a * b
    }

    override fun opseg(): Double {
        return 2 * a + 2 * b
    }
}

var rect = Rectangle()
println(rect.opseg())
println(rect.povrsina())