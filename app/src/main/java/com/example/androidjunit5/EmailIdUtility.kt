package com.example.androidjunit5

import java.util.regex.Pattern

object EmailIdUtility {
    fun isValid(email: String) : Boolean {
        val regex =
            "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"
        val pattern = Pattern.compile(regex)
        val m = pattern.matcher(email)
        return m.matches()
    }
}