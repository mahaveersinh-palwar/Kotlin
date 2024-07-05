class emp constructor(var id : Int, var name : String)
{
   constructor():this(1,"Mahaveersinh")
   {
       println("Id : $id, Name : $name")
   }

    constructor(id: Int, name: String):this()
        {
            this.id = id
            this.name = name

        }


}

fun main()
{
    var emp1 = emp()
    println(emp1.id)
    var emp2 = emp()


}