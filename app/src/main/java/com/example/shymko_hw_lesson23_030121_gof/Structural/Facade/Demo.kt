package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

import java.io.File

object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        val converter = VideoConversionFacade()
        val mp4Video: File = converter.convertVideo("youtubevideo.ogg", "mp4")
        // ...
    }
}