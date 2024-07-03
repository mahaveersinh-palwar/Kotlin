class Tree(var branches : String ,var fruits : String)
{
    fun printAll()
    {
        println("$branches")
        println("$fruits")

    }
}

fun main()
{
    var t= Tree("asd","caca")
    t.printAll()
    //change the variable value
    t.fruits="apple"
    println(t.fruits)
}