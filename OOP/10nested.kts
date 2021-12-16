class outerClass {
    var str = "Outer class"
    class nestedClass {
        var s1 = "Nested class"

        fun nestfunc(str2: String): String {
            var s2 = s1.plus(str2)
            return s2
        }
    }
}


    val nested = outerClass.nestedClass()

    var result = nested.nestfunc(" ide")
    println(result)
