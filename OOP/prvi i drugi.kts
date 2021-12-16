class Person(var firstName : String){
    lateinit var lastName : String

    constructor(firstName : String , lastName : String): this(firstName){
        this.firstName = firstName
        this.lastName = lastName
    }
}

var person = Person("Ivan","Zeman")
println(person.firstName)
println(person.lastName)