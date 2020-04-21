package com.rsk.kotlin.teste

class Calculator (val ouput: Result){
    fun add(x: Int, y: Int): Any {
        return 0
    }
}

interface Result{
    fun write(answer: Int)
}

class NullResult: Result{
    override fun write(answer: Int){

    }
}