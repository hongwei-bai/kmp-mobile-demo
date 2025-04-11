package com.example.kmpas1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform