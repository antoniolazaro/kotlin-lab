package demo.objects

import java.util.Scanner
import kotlin.math.pow

import java.util.*
import kotlin.math.sqrt


fun main(args: Array<String>) {
    forTest2()
}

fun forTest2(){
    val scanner = Scanner(System.`in`)
    val size = scanner.nextLine().toInt()
    val numbers = scanner.nextLine().split(" ").toList().map(String::toInt)
    var maxSequence = 0
    var last:Int = -1
    var maxValue = -1
    for(value in numbers){
        if(value >= last){
            maxSequence++
            if(maxSequence > maxValue){
                maxValue = maxSequence
            }
        }else{
            maxSequence = 1
        }
        last = value
    }
    println(maxValue)
}

fun math(){
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    for(x in 0..1000){
        val root = a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x + d
        println(if(root.toDouble() == 0.0) x else "")
    }
}
fun forTest(){
    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }
}

fun repeatTest2(){
    val scanner = Scanner(System.`in`)
    val repeatTimes = scanner.nextInt()
    var maxNumber = -1
    repeat(repeatTimes) {
        val value = scanner.nextInt()
        if (value % 4 == 0 && value > maxNumber) {
            maxNumber = value
        }
    }
    print(maxNumber)
}

fun repeatTest(){
    val scanner = Scanner(System.`in`)
    val repeatTimes = scanner.nextInt()
    val arrayA = mutableListOf<Int>()
    val arrayB = mutableListOf<Int>()
    val arrayC = mutableListOf<Int>()
    val arrayD = mutableListOf<Int>()
    repeat(repeatTimes){
        val input = scanner.nextInt()
        when(input){
            2 -> arrayD.add(input)
            3 -> arrayC.add(input)
            4 -> arrayB.add(input)
            5 -> arrayA.add(input)
        }
    }
    print("${arrayD.size} ${arrayC.size} ${arrayB.size} ${arrayA.size}")
}

fun boxes() {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val x3 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val y3 = scanner.nextInt()

    val sumX = sqrt(x1.toDouble().pow(2) + x2.toDouble().pow(2) + x3.toDouble().pow(2))
    val sumY = sqrt(y1.toDouble().pow(2) + y2.toDouble().pow(2) + y3.toDouble().pow(2))

    if (sumX > sumY) {
        println("Box 1 > Box 2")
    } else if (sumX < sumY) {
        println("Box 1 < Box 2")
    } else if (sumX == sumY) {
        println("Box 1 = Box 2")
    } else {
        println("Incomparable")
    }
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val c = scanner.nextInt()
        val d = scanner.nextInt()
        for(x in 0..1000){
            val root = a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x + d
            println(if(root.toInt() == 0) println(x) else println(""))
        }
}

private fun letters() {
    val letters = mutableMapOf<String, Int>()
    val scan = Scanner(System.`in`)
    var major = "stop"
    var valorMaior = -1

    var word = scan.nextLine()
    while (!word.equals("stop", ignoreCase = true)) {
        var valorAtual = 1
        if (letters[word] != null) {
            valorAtual = letters[word]!! + 1
        }

        letters[word] = valorAtual
        if (valorAtual > valorMaior) {
            major = word
            valorMaior = valorAtual
        }
        word = scan.nextLine()
    }
    if (letters.isEmpty()) {
        print(null)
    } else {
        print(major)
    }
    println(greetNeo())
}

private fun teste() {
    val scanner = Scanner(System.`in`)
    val parameterName = scanner.nextLine()
    val parameterValue = scanner.nextInt()
    when (parameterName) {
        "startingAmount" -> println(finalAmount(startingAmount = parameterValue))
        "yearPercent" -> println(finalAmount(yearPercent = parameterValue))
        "years" -> println(finalAmount(years = parameterValue))
    }

    val valor = scanner.nextInt()
    println(if (valor in -15..12 || valor in 14..17 || valor > 19) "True" else "False")
}


fun checkEqual(s1: String, s2: String, ignoreCase: Boolean = false): Boolean{ return true}

fun numbers(a: Int = 0, b: Int, c: Int) = a+b+c
fun numbers1(a: Int = 0, b: Int = 0, c: Int) = a+b+c
fun numbers2(a: Int = 0, b: Int, c: Int = 0) = a+b+c
fun numbers3(a: Int, b: Int = 0, c: Int) = a+b+c
fun numbers4(a: Int, b: Int, c: Int = 0) = a+b+c
fun numbers5(a: Int, b: Int = 0, c: Int = 0) = a+b+c

fun greetNeo() = greetUser(name = "Anderson", honorific = "Mr", greet = "Hello")

fun greetUser(
        name: String,
        admin: Boolean = false,
        smith: Boolean = false,
        honorific: String = "",
        greet: String = "Greetings"
): String {
    return if (!admin && !smith) {
        "$greet, $honorific $name"
    } else {
        "Matrix Error"
    }
}

fun finalAmount(startingAmount: Int = 1000, yearPercent: Int = 5, years: Int = 10): Int = (startingAmount * (1 + (yearPercent.toDouble() / 100)).toDouble().pow(years.toDouble())).toInt()


fun identity(number: Int) = number
fun half(number: Int) = (number/2).toInt()
fun zero(number: Int) = 0

fun generate(functionName: String): (Int) -> Int {
    when (functionName) {
        "identity" -> return { number -> (identity(number)) }
        "half" -> return { number -> half(number) }
        "zero" -> return { number -> zero(number) }
        else -> throw RuntimeException("Error")
    }
}

