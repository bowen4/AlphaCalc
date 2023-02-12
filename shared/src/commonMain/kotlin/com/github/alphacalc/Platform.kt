package com.github.alphacalc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform