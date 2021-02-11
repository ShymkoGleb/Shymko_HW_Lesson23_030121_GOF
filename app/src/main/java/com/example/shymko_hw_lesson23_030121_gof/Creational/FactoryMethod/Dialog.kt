package com.example.shymko_hw_lesson23_030121_gof.Creational.FactoryMethod

abstract class Dialog {
    fun renderWindow() {
        val okButton = createButton()
        okButton.render()
    }

    abstract fun createButton(): Button
}