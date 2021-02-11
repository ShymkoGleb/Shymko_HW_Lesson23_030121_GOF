package com.example.shymko_hw_lesson23_030121_gof.Structural.Adapter

class SquarePeg(val width: Int) {
    val square: Double
        get() {
            val result: Double
            result = Math.pow(width.toDouble(), 2.0)
            return result
        }

}