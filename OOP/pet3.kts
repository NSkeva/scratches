interface MyInterface {
    val prop: Int

    val propertyWithImplementation: String
        get() = "funk"

    fun funk() {
        println(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
}

val Child1 = Child()
Child1.funk()