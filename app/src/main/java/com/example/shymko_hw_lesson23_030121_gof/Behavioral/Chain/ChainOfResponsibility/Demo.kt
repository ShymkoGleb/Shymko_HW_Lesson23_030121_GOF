package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Chain.ChainOfResponsibility

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


    fun main() {
         val reader = BufferedReader(InputStreamReader(System.`in`))
         val server = Server()
            server.register("admin@example.com", "admin_pass")
            server.register("2", "3")
            server.register("user2@example.com", "user2_pass")


            // All checks are linked. Client can build various chains using the same
            // components.
            val middleware: Middleware = ThrottlingMiddleware(2)
            middleware.linkWith(UserExistsMiddleware(server))
                .linkWith(RoleCheckMiddleware())

            // Server gets a chain from client code.
            server.setMiddleware(middleware)

        var success: Boolean
        @Throws(IOException::class)
        do {
            print("Enter email: ")
            val email: String = reader.readLine()
            print("Input password: ")
            val password: String = reader.readLine()
            success = server.logIn(email, password)
        } while (!success)
    }




/*
object Demo {
    private val reader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
    private var server: Server? = null
    private fun init() {
        server = Server()
        server!!.register("admin@example.com", "admin_pass")
        server!!.register("user@example.com", "user_pass")

        // All checks are linked. Client can build various chains using the same
        // components.
        val middleware: Middleware = ThrottlingMiddleware(2)
        middleware.linkWith(UserExistsMiddleware(server!!))
            ?.linkWith(RoleCheckMiddleware())

        // Server gets a chain from client code.
        server!!.setMiddleware(middleware)
    }

   @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        init()
        var success: Boolean
        do {
            print("Enter email: ")
            val email: String = reader.readLine()
            print("Input password: ")
            val password: String = reader.readLine()
            success = server!!.logIn(email, password)
        } while (!success)
    }
}*/
