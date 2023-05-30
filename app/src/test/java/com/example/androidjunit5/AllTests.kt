package com.example.androidjunit5

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

/**
 * Execute several test class in one, which is used the test suite
 * Running a test sute executes all test classes in that suite in the
 * specified order
 * ( a test suite can also contain other test suites)
 */
@RunWith(Suite::class)
@SuiteClasses(
    CalculatorTest::class,
    ParameterizedTestFields::class
)
class AllTests {
}