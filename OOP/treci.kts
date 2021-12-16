class Person(var firstName : String){
    lateinit var lastName : String
    private val OIB = 11111111111
    protected open val brojMob = 0919119111
    internal open val brojR = 3
    val starost = 21  // public by default
    constructor(firstName : String , lastName : String): this(firstName){
        this.firstName = firstName
        this.lastName = lastName
    }
}

var person = Person("Ivan","Zeman")
println(person.firstName)
println(person.lastName)