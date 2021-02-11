package com.example.shymko_hw_lesson23_030121_gof.Behavioral.Observer

import java.io.File

class Editor {
    var events: EventManager = EventManager("open", "save")
    private lateinit var file: File
    fun openFile(filePath: String) {
        file = File(filePath)
        events.notify("open", file)
    }
    @Throws(Exception::class)
    fun saveFile() {
        events.notify("save", file)
    }
}