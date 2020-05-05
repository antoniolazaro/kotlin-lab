package demo.objects

import java.lang.IllegalArgumentException
import java.util.*

/*
Your little brother wants to learn by heart different currencies, so you want to create a game for him. The game is to read two countries and print true if those countries have the same currency and false if the currencies are different in these countries, or there is no information about at least one of them.

To create this game, you need to write a special dictionary with the following countries and currencies:
Country 	Currency
Germany 	Euro
Mali 	CFA franc
Dominica 	Eastern Caribbean dollar
Canada 	Canadian dollar
Spain 	Euro
Australia 	Australian dollar
Brazil 	Brazilian real
Senegal 	CFA franc
France 	Euro
Grenada 	Eastern Caribbean dollar
Kiribati 	Australian dollar

Note that the names of the countries are to start with a capital letter!
 */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine().split(" ")
    val c1 = input[0].toUpperCase()
    val c2 = input[1].toUpperCase()
   try {
       print(Country.valueOf(c1).currency == Country.valueOf(c2).currency)
   }catch(e: IllegalArgumentException){
       print(false)
   }
}

enum class Country(val country:String,val currency:String){
    GERMANY("Germany","Euro"),
    MALI("MalI","CFA franc"),
    DOMINICA("Dominica","Eastern Caribbean dollar"),
    CANADA("Canada","Canadian dollar"),
    SPAIN("Spain","Euro"),
    AUSTRALIA("Australia","Australian dollar"),
    BRAZIL("Brazil","Brazilian real"),
    SENEGAL("Senegal","CFA franc"),
    FRANCE("France","Euro"),
    GRENADA("Grenada","Eastern Caribbean dollar"),
    KIRIBATI("Kiribati","Australian dollar");
}