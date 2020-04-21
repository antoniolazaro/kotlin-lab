package com.rsk

import com.rsk.kotlin.teste.Calculator
import com.rsk.kotlin.teste.NullResult
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.junit.jupiter.api.Assertions

class CalculatorSpek: Spek({
    val calculator = Calculator(NullResult())
    describe("the calculator"){
        it("should add two number"){
            val result = calculator.add(12,13)
            Assertions.assertEquals(25,result)
        }
    }

})