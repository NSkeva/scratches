
    //declaring a data class
    data class covjek(val name: String, val age: Int)
    {
        //property declared in class body
        var visina: Int = 0;
    }

    val man1 = covjek("ivan",18)

    val man2 = man1.copy(name="leonardo")


    val man3 = man1.copy();

    man1.visina=100
    man2.visina=90
    man3.visina=110



    println("${man1} has ${man1.visina} cm height")
    println("${man2} has ${man2.visina} cm height")
    println("${man3} has ${man3.visina} cm height")

