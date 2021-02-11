package com.example.shymko_hw_lesson23_030121_gof.Structural.Adapter

open class RoundPeg {
    open var radius = 0.0
        internal set

    constructor() {}
    constructor(radius: Int) {
        this.radius = radius.toDouble()
    }
}