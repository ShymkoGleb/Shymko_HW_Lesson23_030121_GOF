package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer

import java.io.File


class LogOpenListener(fileName: String) : EventListener {
    private val log: File
    override fun update(eventType: String, file: File) {
        println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.name)
    }

    init {
        log = File(fileName)
    }
}