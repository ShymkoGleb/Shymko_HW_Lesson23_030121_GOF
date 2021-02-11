package com.example.shymko_hw_lesson23_030121_gof.Creational.FactoryMethod


fun main() {
    val dialog = configure()
    runBusinessLogic(dialog)
}
fun configure():Dialog {
    if (System.getProperty("os.name") == "Windows 10") {
        val dialog = WindowsDialog()
        return dialog
    } else {
        val dialog = HtmlDialog()
        return dialog
    }
}
fun runBusinessLogic(dialog:Dialog) {
    dialog.renderWindow()
}
