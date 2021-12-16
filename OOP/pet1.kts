open class prvaKlasa{
    val slova = "SLOVAAAAAAA"
    fun A(){
        println("Prva klasa")
    }
}
//derived class
class nasljedKlasa: prvaKlasa() {
    fun B() {
        println(slova)
        println("Druga Klasa")
    }
}

val nasljed = nasljedKlasa()
nasljed.A()
nasljed.B()

