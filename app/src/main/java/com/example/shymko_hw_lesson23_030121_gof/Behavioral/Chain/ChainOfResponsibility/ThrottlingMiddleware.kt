package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Chain.ChainOfResponsibility

@Suppress("DEPRECATION")
class ThrottlingMiddleware(private val requestPerMinute: Int) : Middleware() {
    private var request = 0
    private var currentTime: Long = System.currentTimeMillis()
    override fun check(email: String, password: String): Boolean {
        if (System.currentTimeMillis() > currentTime + 60000) {
            request = 0
            currentTime = System.currentTimeMillis()
        }
        request++
        if (request >= requestPerMinute) {
            println("Request limit exceeded!")
            Thread.currentThread().stop()
        }
        return checkNext(email, password)
    }
}