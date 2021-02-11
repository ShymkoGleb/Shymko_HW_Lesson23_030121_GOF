package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer

import java.io.File


class EmailNotificationListener(private val email: String) : EventListener {
    override fun update(eventType: String?, file: File?) {
        println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file!!.name)
    }
}