package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

class VideoFile(val name: String) {
    val codecType: String = name.substring(name.indexOf(".") + 1)

}