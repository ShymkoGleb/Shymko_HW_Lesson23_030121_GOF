package com.example.shymko_hw_lesson23_030121_gof.Creational.FactoryMethod

class HtmlDialog : Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}
