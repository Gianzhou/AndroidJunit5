package com.example.androidjunit5

import org.junit.After
import org.junit.Assert.*
import org.junit.Assume
import org.junit.Before
import org.junit.Test
import java.sql.DriverManager.println

class CalculatorTest {

    private lateinit var calculator : Calculator

    /**
     * Executed before each test. It is used to prepare the test environment
     */
    @Before
    @Throws(Exception::class)
    fun setUp() {
        calculator = Calculator()
    }

    /**
     * Executed after each test. It is used to cleanup the test environment.
     * It can also save memory by cleaning up expensive memory structures
     */
    @After
    fun tearDown() {
    }

    /**
     *  Identifies a method as a test method
     */
    @Test
    fun testMultiply() {
        assertEquals( "Regular multiplication should work",
        calculator.multiply(4,5), 20)
    }

    @Test
    fun testMultiplyWithZero() {
        assertEquals( "Multiple with zero should be zero",
        0, calculator.multiply(0,5))
        assertEquals( "Multiple with zero should be zero",
        0, calculator.multiply(5,0))
        println("this is tes : ${System.getProperty("os.nam")}")

        /**
         * use Assume.assumeFalse or Assume.assumeTrue to define a condition for the test.
         * Assume.assumeFalse make the test as invalid, if its condition evaluates to true.
         * (Assume.assumeFalse, the condition if it is true, then the test would not executed (ignore)
         *
         * Assume.assumeTrue evaluates the test as invalid if its condition evaluates to false
         * (Assume.assumeTrue, the condition if it is false, then the test would not executed (ignore)
         */
        Assume.assumeTrue(System.getProperty("os.name").contains("Mac"))
    }

}