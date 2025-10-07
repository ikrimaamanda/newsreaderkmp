package com.example.newsreaderkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform