package demo.objects

/*
Given a program that reads two numbers from input each in a new line:

    The first one represents a number of rooms of a house. It helps define and create an instance of a class depending on that number according to the following rules: 1 – Cabin, 2-3 – Bungalow, 4 – Cottage, 5-7 – Mansion, 8-10 – Palace. If the number is lower than 1, it's a Cabin if the number is greater than 10, it's a Palace;
    The second one is the base price of this house. If this price is lower than 0, this house costs 0, if the number is greater than 1_000_000, the base price is 1_000_000;

There is also a coefficient per each class: 1 – Cabin, 1.2 – Bungalow, 1.25 – Cottage, 1.4 – Mansion, 1.6 – Palace.

The program is to define which house to build and to calculate the final price of this house according to the next rule: base price * coefficient.

Fix the program below and implement the given logic.

Don't forget to print the integer, not a floating-point number!
 */

fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = createHouse(rooms, price)
    println(totalPrice(house))
}

fun createHouse(rooms: Int,price: Int): House{
    return when{
        rooms <= 1 -> Cabin(rooms,price)
        rooms in 2..3 -> Bungalow(rooms,price)
        rooms == 4 -> Cottage(rooms,price)
        rooms in 5..7 -> Mansion(rooms,price)
        else -> Palace(rooms,price)

    }
}

fun totalPrice(house: House): Int{
    return (house.price * house.coefficient).toInt()
}

open class House(val rooms: Int) {
    var price: Int = 0
        set(price){
            field = when {
                price < 0 -> 0
                price > 1_000_000 -> 1_000_000
                else -> {
                    price
                }
            }
        }
    open val coefficient = 0.0
    val finalPrice: Int
        get(){
            return (price * coefficient).toInt()
        }
}
class Cabin(rooms: Int): House(rooms) {
    override val coefficient: Double = 1.0
    constructor(rooms: Int, price: Int): this(rooms){
        super.price = price
    }
}
class Bungalow(rooms: Int) : House(rooms) {
    override val coefficient = 1.2
    constructor(rooms: Int, price: Int) : this(rooms){
        super.price = price
    }
}
class Cottage(rooms: Int) : House(rooms) {
    override val coefficient = 1.25
    constructor(rooms: Int, price: Int) : this(rooms){
        super.price = price
    }
}
class Mansion(rooms: Int) : House(rooms) {
    override val coefficient = 1.4
    constructor(rooms: Int, price: Int) : this(rooms){
        super.price = price
    }
}
class Palace(rooms: Int) : House(rooms) {
    override val coefficient = 1.6
    constructor(rooms: Int, price: Int) : this(rooms){
        super.price = price
    }
}