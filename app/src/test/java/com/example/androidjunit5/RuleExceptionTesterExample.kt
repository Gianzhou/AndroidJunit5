package com.example.androidjunit5

import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException


class RuleExceptionTesterExample {

    /**
     * via Junit rules, behavior could be add into each tests in a test class
     *
     */
    @get:Rule
    val exception: ExpectedException = ExpectedException.none()

    @Test(expected = IllegalArgumentException::class)
    fun testExceptionIsThrow() : Unit {
        val tester  = MyClass()
        tester.multiply(1000, 5)
    }

    @Test
    fun testMultiply() {
        val tester = MyClass()
        assertEquals("10 * 5 must be 50", 50,
        tester.multiply(10, 5))
    }
    @Test
    fun throwsIllegalArgumentException() {
        exception.expect(IllegalArgumentException::class.java)
        val tester = MyClass()
        tester.multiply(20000, 5)

    }

}
