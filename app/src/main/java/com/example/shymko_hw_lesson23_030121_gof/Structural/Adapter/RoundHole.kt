package com.example.shymko_hw_lesson23_030121_gof.Structural.Adapter

class RoundHole(val radius: Int) {

    fun fits(peg: RoundPeg): Boolean {
        val result: Boolean
        result = radius >= peg.radius
        return result
    }
}