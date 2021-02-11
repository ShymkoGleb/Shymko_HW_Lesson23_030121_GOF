package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer


object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        val editor = Editor()
        editor.events.subscribe("open", LogOpenListener("/path/to/log/file.txt"))
        editor.events.subscribe("save", EmailNotificationListener("admin@example.com"))
        try {
            editor.openFile("test.txt")
            editor.saveFile()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}