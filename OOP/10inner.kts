
class outerClass {
    var str = "Outer class"

    inner class innerClass {
        var s1 = "Inner class"
        fun nestfunc(): String {

            var s2 = str
            return s2
        }
    }
}

    val inner= outerClass().innerClass()

    println(inner.nestfunc()+" ideeee ")
