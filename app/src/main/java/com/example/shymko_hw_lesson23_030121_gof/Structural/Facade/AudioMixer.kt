package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

import java.io.File


class AudioMixer {
    fun fix(result: VideoFile?): File {
        println("AudioMixer: fixing audio...")
        return File("tmp")
    }
}