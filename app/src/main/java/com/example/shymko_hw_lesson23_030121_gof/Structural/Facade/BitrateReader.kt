package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

object BitrateReader {
    fun read(file: VideoFile, codec: Codec): VideoFile {
        println("BitrateReader: reading file...")
        return file
    }

    fun convert(buffer: VideoFile, codec: Codec): VideoFile {
        println("BitrateReader: writing file...")
        return buffer
    }
}
