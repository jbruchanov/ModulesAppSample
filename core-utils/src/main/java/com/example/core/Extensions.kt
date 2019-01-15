package com.example.core

import java.util.*

fun Long.toDateTimeString(): String {
    return Date(this).toGMTString()
}