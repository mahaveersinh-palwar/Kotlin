fun printall(vararg msg : String)
{
    for (m in msg)
    {
        println(m)
    }
}

fun main()
{
    printall("abc","cdc","ece","ece")
}