package com.example.androidjunit5

class MyClass {
    fun multiply(x : Int,  y : Int) : Int {
        if (x > 999) {
            throw java.lang.IllegalArgumentException("X should be less than 1000")
        }
        return x*y
    }
}