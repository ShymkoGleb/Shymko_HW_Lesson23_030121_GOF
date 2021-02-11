package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer

import java.io.File

class Editor {
    var events: EventManager
    private lateinit var file: File
    fun openFile(filePath: String) {
        file = File(filePath)
        events.notify("open", file)
    }

    @Throws(Exception::class)
    fun saveFile() {
        if (file != null) {
            events.notify("save", file)
        } else {
            throw Exception("Please open a file first.")
        }
    }

    init {
        events = EventManager("open", "save")
    }
}