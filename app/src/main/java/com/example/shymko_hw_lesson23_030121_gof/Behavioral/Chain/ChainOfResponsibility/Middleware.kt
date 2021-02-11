package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Chain.ChainOfResponsibility



abstract class Middleware {
    lateinit var next: Middleware
    /**
     * Builds chains of middleware objects.
     */
    fun linkWith(next: Middleware): Middleware {
        this.next = next
        return next
    }
    /**
     * Subclasses will implement this method with concrete checks.
     */
    abstract fun check(email: String, password: String): Boolean
    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    fun checkNext(email: String, password: String): Boolean {
        return next.check(email, password)
    }
}