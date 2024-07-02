fun main()
{
     var myArray1 = Array<Int>(5){0}

     var myArray2 = arrayOf(1,2,3,4,5)

    var myArray3 = arrayOf<String>("a","b","c","d","e","f","g","h")

    var myArray4 = arrayOf(1,2,3,4,5,"a","b","c")

    var myArray5 = arrayOf<Int>(1,2,3,4,5)

    println(myArray1[1])

    println(myArray2[2])

    println(myArray3[5])

    println(myArray4[2])

    println(myArray5[1])

    for(i in myArray4)
    {
        print("$i ")
    }
}