package com.lizongying.mytv.api

data class TimeResponse(
    val data: Time
) {
    data class Time(
        val t: String
    )
}