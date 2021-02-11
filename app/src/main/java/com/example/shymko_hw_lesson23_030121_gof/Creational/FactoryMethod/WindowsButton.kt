package com.example.shymko_hw_lesson23_030121_gof.Creational.FactoryMethod


class WindowsButton : Button {
    override fun render() {
        println("<button>Test WindowsButton</button>")
        onClick()
    }

    override fun onClick() {
        println("Click! WindowsButton says - 'Hello World!'")
    }
}