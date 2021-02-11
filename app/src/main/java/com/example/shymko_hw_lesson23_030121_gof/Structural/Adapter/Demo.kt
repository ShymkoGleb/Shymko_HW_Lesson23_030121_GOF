package com.example.shymko_hw_lesson23_030121_gof.Structural.Adapter

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        // Round fits round, no surprise.
        val hole = RoundHole(5)
        val rpeg = RoundPeg(5)
        if (hole.fits(rpeg)) {
            println("Round peg r5 fits round hole r5.")
        }
        val smallSqPeg = SquarePeg(2)
        val largeSqPeg = SquarePeg(20)
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
        val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)
        if (hole.fits(smallSqPegAdapter)) {
            println("Square peg w2 fits round hole r5.")
        }
        if (!hole.fits(largeSqPegAdapter)) {
            println("Square peg w20 does not fit into round hole r5.")
        }
    }
}