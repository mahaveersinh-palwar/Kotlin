fun main()
{
    print("Enter Mark Of Kotlin :")
    var k : Float = readLine()!!.toFloat()

    print("Enter Mark Of NodeJs :")
    var nj : Float = readLine()!!.toFloat()

    print("Enter Mark Of Ml :")
    var ml : Float = readLine()!!.toFloat()

    print("Enter Mark Of Os :")
    var o : Float = readLine()!!.toFloat()

    print("Enter Mark Of Mvc.Net :")
    var mn : Float = readLine()!!.toFloat()

    println("*********** Your Result Is *************")

    println("--------------------------------")
    println("Subject Name \t\t  | Mark ")
    println("--------------------------------")
    println("  Kotlin \t\t\t  | ${k}")
    println("  NodeJs \t\t\t  | ${nj}")
    println("  Ml \t\t\t      | ${ml}")
    println("  Os \t\t\t      | ${o}")
    println("  Mvc.Net \t\t\t  | ${mn}")
    println("--------------------------------")
    var total : Float
    total = (k + nj + ml + o + mn)
    println("  Total \t\t      | ${total} ")

    var per : Float
    per = total / 5
    println("--------------------------------")
    println("Percentage \t\t\t  | ${per}% ")

    if (per <= 100 && per >= 95)
    {
        println("--------------------------------")
        println("You Achieved A+ Grade")
        println("--------------------------------")
    }

    else if (per <= 94 && per >= 90)
    {
        println("--------------------------------")
        println("You Achieved A Grade")
        println("--------------------------------")
    }

    else if (per <= 89 && per >= 80)
    {
        println("--------------------------------")
        println("You Achieved B+ Grade")
        println("--------------------------------")
    }

    else if (per <= 79 && per >= 70)
    {
        println("--------------------------------")
        println("You Achieved B Grade")
        println("--------------------------------")
    }

    else if (per <= 69 && per >= 60)
    {
        println("--------------------------------")
        println("You Achieved C+ Grade")
        println("--------------------------------")
    }

    else if (per <= 59 && per >= 50)
    {
        println("--------------------------------")
        println("You Achieved C Grade")
        println("--------------------------------")
    }

    else if (per <= 49 && per >= 36)
    {
        println("--------------------------------")
        println("You Achieved D Grade")
        println("--------------------------------")
    }

    else
    {
        println("--------------------------------")
        println("You Got RA ")
        println("--------------------------------")
    }

}