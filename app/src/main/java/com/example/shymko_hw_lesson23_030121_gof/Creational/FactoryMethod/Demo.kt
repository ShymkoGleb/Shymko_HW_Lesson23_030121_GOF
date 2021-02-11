package com.example.shymko_hw_lesson23_030121_gof.Creational.FactoryMethod

object Demo {
    private var dialog: Dialog? = null
    @JvmStatic
    fun main(args: Array<String>) {
        configure()
        runBusinessLogic()
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    fun configure() {
        if (System.getProperty("os.name") == "Windows 10") {
            dialog = WindowsDialog()
        } else {
            dialog = HtmlDialog()
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    fun runBusinessLogic() {
        dialog!!.renderWindow()
    }
}