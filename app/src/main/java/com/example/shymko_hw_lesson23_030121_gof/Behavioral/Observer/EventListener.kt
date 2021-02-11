package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer

import java.io.File


interface EventListener {
    fun update(eventType: String?, file: File?)
}