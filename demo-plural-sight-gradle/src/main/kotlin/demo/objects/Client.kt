package demo.objects

import java.util.Scanner

/*
Write a program that reads six values (name, age, balance, name, age, balance) and uses all of them as fields of a data class, that is, Client.

Change this given data class in order to check two different clients no matter their balances. It means that two clients are equal if they have the same name and age. Print the result as true or false.

 */

data class Client(val name: String, val age: Int, val balance: Int){
    override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Client
        return name == other.name && age == other.age
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val params1 = input.nextLine().split(" ")
    val client1 = Client(params1[0],params1[1].toInt(),params1[2].toInt())

    val params2 = input.nextLine().split(" ")
    val client2 = Client(params2[0],params2[1].toInt(),params2[2].toInt())
    println(client1 == client2)
}


