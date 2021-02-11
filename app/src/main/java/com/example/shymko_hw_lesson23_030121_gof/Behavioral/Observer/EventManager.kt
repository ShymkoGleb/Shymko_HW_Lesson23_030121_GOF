package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer

import java.io.File
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class EventManager {
    var listeners: MutableMap<String, MutableList<EventListener>> = HashMap()

    constructor(vararg operations: String) {
        for (operation in operations) {
            listeners[operation] = ArrayList()
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        val users: MutableList<EventListener>? = listeners[eventType]
        users?.add(listener)
    }

    fun unsubscribe(eventType: String, listener: EventListener) {
        val users: MutableList<EventListener>? = listeners[eventType]
        users?.remove(listener)
    }

    fun notify(eventType: String, file: File) {
        val users: List<EventListener>? = listeners[eventType]
        if (users != null) {
            for (listener in users) {
                listener.update(eventType, file)
            }
        }
    }
}