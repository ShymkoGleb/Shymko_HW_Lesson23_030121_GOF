package com.example.shymko_hw_lesson23_030121_gof.Creational.FactoryMethod

abstract class Dialog {
    fun renderWindow() {
        // ... other code ...
        val okButton = createButton()
        okButton.render()
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    abstract fun createButton(): Button
}