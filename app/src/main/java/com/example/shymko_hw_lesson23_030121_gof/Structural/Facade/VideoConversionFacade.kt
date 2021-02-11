package com.example.shymko_hw_lesson23_030121_gof.Structural.Facade

import android.support.v4.app.RemoteActionCompatParcelizer.read
import android.system.Os.read

import com.example.shymko_hw_lesson23_030121_gof.Structural.Facade.CodecFactory.extract
import java.io.File


class VideoConversionFacade {
    fun convertVideo(fileName: String?, format: String): File {
        println("VideoConversionFacade: conversion started.")
        val file = VideoFile(fileName!!)
        val sourceCodec = extract(file)
        val destinationCodec: Codec
        destinationCodec = if (format == "mp4") {
            OggCompressionCodec()
        } else {
            MPEG4CompressionCodec()
        }
        val buffer: VideoFile = BitrateReader.read(file, sourceCodec)
        val intermediateResult: VideoFile = BitrateReader.convert(buffer, destinationCodec)
        val result: File = AudioMixer().fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }
}