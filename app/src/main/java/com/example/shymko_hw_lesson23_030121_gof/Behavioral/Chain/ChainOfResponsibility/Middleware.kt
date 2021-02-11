package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Chain.ChainOfResponsibility



abstract class Middleware {
    lateinit var next: Middleware

    fun linkWith(next: Middleware): Middleware {
        this.next = next
        return next
    }

    abstract fun check(email: String, password: String): Boolean

    fun checkNext(email: String, password: String): Boolean {
        return next.check(email, password)
    }
}