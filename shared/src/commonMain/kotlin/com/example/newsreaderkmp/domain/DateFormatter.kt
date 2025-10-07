package com.example.newsreaderkmp.domain

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

internal expect object DateFormatter {
    fun getStringTime(timeInSeconds: Long): String
}