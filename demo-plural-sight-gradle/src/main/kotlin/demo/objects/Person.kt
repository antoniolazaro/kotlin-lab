package demo.objects

interface Signatory {
    fun sign()
}

open class Person(val name:String, var age: Int ): Signatory{

    var isMarried = false

    constructor(name:String, age:Int,isMarried: Boolean) : this(name,age){
        this.isMarried = isMarried
    }
    init{
//        if(age < 54 ) throw Exception("Invalid age")
    }


    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")

}

class Student( name:String, age: Int ) : Person(name,age)
//class Student(val name:String, var age: Int ) : Person(name,age) //wronmg

fun main(args: Array<String>) {
    val p = Person("Jhon",21,true)
    p.sign()

    p.age = 55
    p.sign()
}