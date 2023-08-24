package com.example.kmmnavigationmat3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform