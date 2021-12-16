fun main(args: Array<String>)
{
    println(GFG.name)
    println("The answer of addition is ${GFG.add(3,2)}")
    println("The answer of addition is ${GFG.add(10,15)}")
}

object  GFG
{
    init
    {
        println("Singleton class invoked.")
    }

    var name = "GFG Is Best"
    fun add(num1:Int,num2:Int):Int
    {
        return num1.plus(num2)
    }
}