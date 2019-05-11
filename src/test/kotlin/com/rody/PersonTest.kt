package com.rody.kotlin

import com.rody.Human
import com.rody.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest() {
        val human=Human(66.5f,1.7f,"Rody");
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())
    }

    @Test
    fun personBmiTest(){
        val person= Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi())
    }
}