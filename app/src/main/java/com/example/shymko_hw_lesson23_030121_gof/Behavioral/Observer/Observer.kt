package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer

import kotlin.properties.Delegates

typealias PropertyChangeListener = (Int) -> Unit

class Property {

    private val listeners = arrayListOf<PropertyChangeListener>()

    var value by Delegates.observable(0) { _, old, new ->
        println("The value was: $old")
        listeners.forEach { listener -> listener(new) }
    }

    fun registerListener(listener: PropertyChangeListener) {
        listeners.add(listener)
    }
}

fun main(args: Array<String>) {
    val property = Property()
    property.registerListener { new -> println("The new value is $new") }

    property.value = 1989
    property.value = 2017
}