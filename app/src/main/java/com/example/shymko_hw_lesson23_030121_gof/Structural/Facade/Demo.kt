package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

import java.io.File

fun main() {
    val converter = VideoConversionFacade()
    val mp4Video: File = converter.convertVideo("youtubevideo.ogg", "mp4")
    println("")
    val oggVideo: File = converter.convertVideo("travel.ogg", "ogg")

}
