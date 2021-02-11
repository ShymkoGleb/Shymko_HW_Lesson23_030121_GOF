package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Chain.ChainOfResponsibility

class Server {
    private val users: MutableMap<String, String> = HashMap()
    private lateinit var middleware: Middleware

    fun setMiddleware(middleware: Middleware) {
        this.middleware = middleware
    }

    fun logIn(email: String, password: String): Boolean {
        if (middleware.check(email, password)) {
            println("Authorization have been successful!")
            return true
        }
        return false
    }

    fun register(email: String, password: String) {
        users[email] = password
    }

    fun hasEmail(email: String): Boolean {
        return users.containsKey(email)
    }

    fun isValidPassword(email: String, password: String): Boolean {
        return users[email] == password
    }
}