val a = 3.0
val b = 4.0
val c = 5.0
var opseg = 0.00
var povrsina = 0.00
if (a + b >= c && a + c > b && b + c > a) {
    opseg = a + b + c
    val s = opseg / 2.0
    povrsina = s * (s - a) * (s - b) * (s - c)
}
println("Opseg je $opseg")
println("Povrsina je $povrsina")
when {
    povrsina > a*b/2 -> println("Trokut je tupokutan")
    povrsina < a*b/2 -> println("Trokut je šiljastokutan")
    povrsina == a*b/2 -> println("Trokut je pravokutan")
    else -> println("Nije trokut")
}