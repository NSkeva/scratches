class IDEEEEEE {
    var name: String = ""
        get() = field        // getter
        set(value) {         // setter
            field = value
        }
}

    val c = IDEEEEEE()
    c.name = "GAAAAS"  // access setter
    println(c.name)           // access getter
