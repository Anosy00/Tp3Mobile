package com.example.tp3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform