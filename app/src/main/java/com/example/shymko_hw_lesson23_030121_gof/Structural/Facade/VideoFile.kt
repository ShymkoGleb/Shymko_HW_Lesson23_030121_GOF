package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

class VideoFile(val name: String) {
    val codecType: String

    init {
        codecType = name.substring(name.indexOf(".") + 1)
    }
}