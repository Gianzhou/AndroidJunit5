package com.example.androidjunit5

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*

/**
 * JUnit allows to use parameters in a tests class.
 * This class can contain one test method and this method is executed with
 * the different parameters provided.
 *
 * 1. The number of elements in each array provides by the method annotated with
 * @Parameters must correspond to the number of parameters in the constructor of the class. The class is created
 * for each parameter and the test values are passed via the constructor to the class
 */
@RunWith(Parameterized::class)
class ParameterizedTestFields(
    private val email : String,
    private val expected : Boolean ) {


    @Test
    fun testIsValidEmailId() {
        val actual = EmailIdUtility.isValid(email)
        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: isValid({0})={1}")
        fun data(): Iterable<Array<Any>> {
            return arrayListOf(
                arrayOf("mary@testdomain.com", true),
                arrayOf("mary.smith@testdomain.com", true),
                arrayOf("mary_smith123@testdomain.com", true),
                arrayOf("mary@testdomaindotcom", false),
                arrayOf("mary-smith@testdomain", false),
                arrayOf("testdomain.com", false)
            )
        }
    }
}