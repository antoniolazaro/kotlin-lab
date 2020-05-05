package demo.objects

/*
Given a program that reads three numbers. They represent the weather from three cities: Dubai,
Moscow, and Hanoi. This program prints the name of the colder city. According to the real-life
rules, there are some restrictions: if the input number is less than -92 or greater than 57,
the weather will be +5 for Moscow, +20 for Hanoi and +30 for Dubai (like an average temperature
for these cities). If several cities have the same minimum temperature,  the output will be neither.
Finish the implementation of the City class that will follow this logic and comparing in main
function.
 */
class City(val name: String) {
    var degrees: Int = 0
        set(value){
            if(value < -92 || value > 57){
                when(name){
                    "Moscow" -> field = 5
                    "Hanoi" -> field = 20
                    "Dubai" -> field = 30
                    else -> field = value
                }
            }else{
                field = value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    if(firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees){
        print("Dubai")
    }else if(secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees){
        print("Moscow")
    }else if(thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees){
        print("Hanoi")
    }else{
        print("neither")
    }

}