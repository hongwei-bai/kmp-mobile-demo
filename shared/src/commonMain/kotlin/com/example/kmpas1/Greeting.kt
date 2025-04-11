package com.example.kmpas1

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello1, ${platform.name}!"
    }
}