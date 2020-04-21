package demo.objects

interface Signatory2 {
    fun sign()
}

open class Person2(val name:String, var age: Int,var isMarried: Boolean = false): Signatory2{

    var partnerName: String = ""

    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person2("Jhon",21,true)
            p.sign()

            p.age = 55
            p.sign()

            p.partnerName = "Alex"
            println("Partner name is ${p.partnerName}")

            val kevin = User("Kevin",1)
            println(kevin)

            val (name,id) = kevin

            println("User is $name and their id is $id")

            val otherUser = kevin.copy(id=2)

            println(otherUser)
        }
    }

}

class Student2( name:String, age: Int ) : Person2(name,age)

data class User(val name: String,val id: Int)