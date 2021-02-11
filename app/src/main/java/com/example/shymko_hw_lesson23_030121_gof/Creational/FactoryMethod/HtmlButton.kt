package com.example.shymko_hw_lesson23_030121_gof.Creational.FactoryMethod

class HtmlButton : Button {
    override fun render() {
        println("<button>Test HtmlButton</button>")
        onClick()
    }

    override fun onClick() {
        println("Click! HtmlButton says - 'Hello World!'")
    }
}