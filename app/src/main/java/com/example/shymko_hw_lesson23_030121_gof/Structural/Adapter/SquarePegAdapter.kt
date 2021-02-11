package com.example.shymko_hw_lesson23_030121_gof.Structural.Adapter

class SquarePegAdapter(private val peg: SquarePeg) : RoundPeg() {
    // Calculate a minimum circle radius, which can fit this peg.
    override var radius: Double
        get() {
            val result: Double
            // Calculate a minimum circle radius, which can fit this peg.
            result = Math.sqrt(Math.pow((peg.width / 2).toDouble(), 2.0) * 2)
            return result
        }
        set(radius) {
            super.radius = radius
        }
}