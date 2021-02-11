package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Chain.ChainOfResponsibility

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val server = Server()
    server.register("admin@example.com", "admin_pass")
    server.register("user@example.com", "user_pass")
    server.register("2", "3")

    val middleware: Middleware = ThrottlingMiddleware(4)
    middleware.linkWith(UserExistsMiddleware(server))
        .linkWith(RoleCheckMiddleware())

    server.setMiddleware(middleware)
    var success: Boolean
    do {
        print("Enter email: ")
        val email = reader.readLine()
        print("Input password: ")
        val password = reader.readLine()
        success = server.logIn(email, password)
    } while (!success)
}