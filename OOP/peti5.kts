sealed class Color{
    object Red : Color()
    object Orange : Color()
    object Blue : Color()
}
fun eval(c: Color) =
    when (c) {
        is Color.Red -> println("Paint in Red Color")
        is Color.Orange -> println("Paint in Orange Color")
        is Color.Blue -> println("Paint in Blue Color")
    }


    val r = Color.Red
    eval(r)
