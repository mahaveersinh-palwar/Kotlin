fun main()
{
    // Switch....Case
    print("Enter A Choice :")
    var number : Int = readLine()!!.toInt()

    when(number)
    {
        1 -> print("You Entered One")
        2 -> print("You Entered Two")
        3 -> print("You Entered Three")

        5,6 -> {
            print("You Entered  either 5 or 6 ")
        }

        in(10 .. 20) -> {
            print("You Entered Number Between 10 To 20")
        }

        else -> {
            print("Please Enter A Valid Choice...")
        }
    }
}