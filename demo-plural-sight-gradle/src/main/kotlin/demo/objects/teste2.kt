package demo.objects

import java.io.File
import java.util.Scanner
import kotlin.math.pow

import java.util.*
import kotlin.math.sqrt


fun main(args: Array<String>) {
    speedAverage()
}

/*
Write a program that reads the distance between the two cities in miles and the travel time by bus in hours, and outputs the average speed of the bus.
 */
fun speedAverage(){
    val scanner = Scanner(System.`in`)
    val distance = scanner.nextDouble()
    val time = scanner.nextDouble()
    print(distance/time)
}
/*
Write a program that reads a character and checks if it is a capital letter or a digit from 1 to 9.
The program must print either true or false.
*/
fun capitalLetterOrDigit(){
    val scanner = Scanner(System.`in`)
    val letter = scanner.nextLine().first().toChar()
    print(letter.isUpperCase() || (letter.toInt() in 49..57) )
}
/*
Write a program that reads three characters and checks if they are ordered according to the
Unicode table, and if each next character immediately follows the previous one (i.e. 'a', 'b', 'c' or 'x', 'y', 'z') according to the alphabet.
The program must print either true or false.
 */
fun testCharsOrder(){
    val scanner = Scanner(System.`in`)
    val letters = scanner.nextLine().split(" ")
    print(letters[1].first().toChar() == letters[0].first().toChar() + 1 && letters[2].first().toChar() ==  letters[1].first().toChar() + 1)
}

/*
Write a program that reads two Latin letters as characters and compares them ignoring cases.
If these characters represent the same letter printtrue , otherwise false.
 */
fun testChars(){
    val scanner = Scanner(System.`in`)
    val letters = scanner.nextLine().split(" ")
    print(letters[0].toLowerCase() == letters[1].toLowerCase())
}
/*
Write a program that reads three numbers and checks if they all are different
(i.e. no number equals to any other).
The program is to output true or false.
 */
fun areTheNumbersDifferent(){
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextLine().split(" ").map(String::toInt)
    print(numbers[0] != numbers[1] &&
            numbers[0] != numbers[2] &&
            numbers[1] != numbers[2])
}

/*
Write a program that reads numbers a, b, c and checks
if any pair of parameters (ab, ac, or bc) sums to 20.
 */
fun checkTheSum(){
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextLine().split(" ").map(String::toInt)
    print((numbers[0]+numbers[1] == 20) ||
            (numbers[0]+numbers[2] == 20) ||
            (numbers[1]+numbers[2] == 20))
}

/*
There is a non-negative integer N (0 ≤ N ≤ 1000000).
Find the number of tens in it (i.e. next to last digit of the number).
If there is no next to last digit, you can consider that the number of tens equals to zero.
 */
fun numberOfTens(){
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    if(input.toString().length > 1){
        println(input.toString()[input.toString().lastIndex-1])
    }else{
        println(0)
    }
}

/*
Write a program that finds the frequency of occurrences of substring in given string.
Input data format
The first input line contains a string, the second one contains a substring.
 */
fun numberOfOccurrences(){
    var text = readLine()!!
    val subText = readLine()!!
    var count  = 0
    while(text.contains(subText) && text.length >= subText.length){
        count++
        text = text.substringAfter(subText)
    }
    print(count)

}

/*
GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum of all guanines and cytosines to the overall number of nucleic bases in the genome sequence.
Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the entered string. Your program should be case independent.
For example, in the string "acggtgttat" the percentage of characters G and C equals to 410⋅100=40.0 \dfrac4{10} \cdot 100 = 40.0 104​⋅100=40.0, where 4 is the number of symbols G and C, and 10 is the length of the string.
 */
fun  thePercentageOfGAndCCharacters(){
    val input = readLine()!!
    println(((input.toLowerCase().filter { c-> c == 'c' || c == 'g'  }.length.toDouble()/input.length.toDouble()) * 100).toDouble())
}

/*
Write a program that reads two lines and then two numbers and outputs
them in the same order, each in a new line.
 */

fun convertText(){
    val word1 = readLine()!!
    val word2 = readLine()!!
    val numbers = readLine()!!.split(" ").map(String::toInt)
    print("$word1\n$word2\n${numbers[0]}\n${numbers[1]}")
}

/*
Write a program that reads five words from the standard input and outputs each word in a new line.
First, you need to print all the words from the first line, then from the second (from left to right).
The words can be placed in the input stream in any way.
To solve the problem, use Scanner .
 */
fun printEachWordInANewLine(){
    val scanner = Scanner(System.`in`)

    var words:List<String> = mutableListOf()
    while(words.size < 5) {
        val input = scanner.nextLine()
        words = words + input.split(" ")
    }
    if(words.size > 5) {
        words = words.subList(0,5)
    }
    words.forEach { i -> println(i) }

}


/*
Write a program that reads four integer numbers from one line and prints them each in a new line.
In the input, numbers are separated by one or more spaces.
 */
fun input(){
    Scanner(System.`in`).nextLine().replace("  "," ").split(" ").filter { s-> s.trim().isNotBlank() }.map(String::toInt).forEach{i->println(i)}
}

/*
There is a string and a number N. Print the N-th symbol of the string. The example shows how the result should look like.
hello world
1
Symbol # 1 of the string "hello world" is 'h'
 */

fun stringTemplate(){
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val index = scanner.nextInt()
    val letter = input[index]
    print("Symbol # $index of the string \"$input\" os '$letter'")
}

/*
You need to write a program that prints date and time in a special format. Hours, minutes and seconds are split by a colon, and day, month and year are split by a slash. Take a look at the examples below.
 */
fun dateAndTimeFormatting(){
    val scanner = Scanner(System.`in`)
    val h = scanner.nextInt()
    val m = scanner.nextInt()
    val s = scanner.nextInt()
    val d = scanner.nextInt()
    val mo = scanner.nextInt()
    val y = scanner.nextInt()
    print("$h:$m:$s $d/$m$y")

}

/*
Let's try to build a small version of the Battleship game.
There is a field with 5 rows (X) and 5 columns (Y), 25 cells in total.

Write a program that reads coordinates (X, Y) of three one-cell-sized ships and prints
all the available rows (X) and columns (Y) for new ships. It means that new ships can be placed
only in rows and columns which are vacant.

All the input coordinates are separated with space. Separate the output in the same way.
Print rows (X) and columns (Y) in two different rows.
 */

fun battleshipGame(){
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextLine().split(" ").map(String::toInt)
    var matrix = Array(5,{IntArray(5)})
    for (i in 0..4) {
        for (j in 0..4) {
            matrix[i][j] = 0
        }
    }
    matrix[numbers[0]-1][numbers[1]-1] = 1
    matrix[numbers[2]-1][numbers[3]-1] = 2
    matrix[numbers[4]-1][numbers[5]-1] = 3

    loop@ for (i in 0..4) {
        for (j in 0..4) {
            if(matrix[i][j] != 0){
                continue@loop;
            }
        }
        print("$i+1")
    }
}

/*
Write a program that reads a word and prints the number of characters that appear only once.
 */
fun uniqueCharacters(){
    val input = Scanner(System.`in`)
    val letter = input.next().toLowerCase()
    var total = 0
    primeiro@ for(indice in letter.toCharArray().indices){
        val currentChar = letter[indice]
        var quantidade = 0
        for(char in letter.toCharArray()){
            if(char == currentChar){
                quantidade++
                if(quantidade > 1){
                    continue@primeiro
                }
            }
        }
        total++
    }
    println(total)
}

/*
 Getting letters from the Alphabet
 */
fun gettingLettersFromTheAlphabet(){
    val input = Scanner(System.`in`)
    val letter = input.next().toLowerCase()
    val char = letter.single()
    for(l in 'a'..char-1){
        print(l)
    }
}

/* Imagine you implement a web service to pay for video games.
There is a text field where a user inputs their card number.
A card number is a string like "AAAA AAAA AAAA AAAA", where A is any digit.
Please note that a correct card number contains three spaces as in the template.
Create a function that returns
the card number as a Long or produces any exception when the card number is incorrect. */
fun parseCardNumber(cardNumber: String): Long {
    if(cardNumber.length != 15){
        throw Exception("Erro no formato do card number")
    }
    return cardNumber.replace(" ","").toLong()
}

fun squaresOfNnaturalNumbers(){
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var value = 1
    var square = value*value
    do{
        println(square)
        value++
        square = value*value
    }while(square < number)
}

fun whileCollatzConjecture(){
    val scanner = Scanner(System.`in`)
    var number = scanner.nextInt()
    print(" $number")
    while(number != 1){
        if(number % 2 == 0){
            number = (number / 2).toInt()
        }else{
            number = number * 3 + 1
        }
        print(" $number")
    }

}

/*
As the input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence contains an integer 0. After reading 0 the program is to end its
work and output the length of the sequence (do not count the final 0).
 */
fun lenghtOfSequence(){
    val scanner = Scanner(System.`in`)

    var count = 0
    do{
        var number = scanner.nextInt()
        count++
    }while(number != 0)
    println(count-1)
}

/*
Write a program that reads an array of integers and two numbers n and m.
The program is to check that n and m never occur next to each other (in any order) in the array.
 */
fun checkTheNumbers(){
    val scanner = Scanner(System.`in`)
    val size = scanner.nextLine().toInt()
    val numbers = scanner.nextLine().split(" ").map(String::toInt)
    val twoValues = scanner.nextLine().split(" ").map(String::toInt)
    val n = twoValues[0]
    val m = twoValues[1]
    var msg = "YES"
    for(indice in 0..numbers.lastIndex){
        if(indice+1 < numbers.size) {
            if ((numbers[indice] == n && numbers[indice + 1] == m) ||
                    (numbers[indice] == m && numbers[indice + 1] == n)) {
                msg = "NO"
                break
            }
        }
    }
    println(msg)
}

fun countTriple(){
    val scanner = Scanner(System.`in`)
    val size = scanner.nextLine().toInt()
    val numbers = scanner.nextLine().split(" ").map(String::toInt)
    var totalTriples = 0
    for(indice in 0..numbers.size){
        if(indice+2 < numbers.size) {
            if (numbers[indice + 1] == numbers[indice] + 1 && numbers[indice + 2] == numbers[indice] + 2) {
                totalTriples++
            } else if (numbers[indice + 1] == numbers[indice] - 1 && numbers[indice + 2] == numbers[indice] - 2) {
                totalTriples++
            }
        }
    }
    println(totalTriples)
}

fun readFile2(){
    print(File("/media/popete/dados/workspace-kotlin/kotlin-lab.git/demo-plural-sight-gradle/src/main/resources/teste2.txt").readLines().get(0).split(" ").size)
}

fun readFile(){
    var maxWord = 0
    var maxWordTxt =  ""
    for(line in File("/media/popete/dados/workspace-kotlin/kotlin-lab.git/demo-plural-sight-gradle/src/main/resources/teste.txt").readLines()){
       if(line.length > maxWord){
           maxWordTxt = line
           maxWord = line.length
       }
    }
    print(maxWordTxt.length)
}

fun forTest2(){

       val scanner = Scanner(System.`in`)
    val size = scanner.nextLine().toInt()
    val numbers = scanner.nextLine().split(" ").map(String::toInt)
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

