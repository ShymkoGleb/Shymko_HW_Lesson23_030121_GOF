package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

object CodecFactory {
    fun extract(file: VideoFile): Codec {
        val type = file.codecType
        return if (type == "mp4") {
            println("CodecFactory: extracting mpeg audio...")
            MPEG4CompressionCodec()
        } else {
            println("CodecFactory: extracting ogg audio...")
            OggCompressionCodec()
        }
    }
}