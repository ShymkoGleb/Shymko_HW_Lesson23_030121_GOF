package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Chain.ChainOfResponsibility

class RoleCheckMiddleware() : Middleware() {

    override fun check(email: String?, password: String?): Boolean {
        if (email.equals("admin@example.com")) {
            println("Hello, Admin")
            return true
        }
        println("Hello User!")
        return checkNext(email, password)
    }
}