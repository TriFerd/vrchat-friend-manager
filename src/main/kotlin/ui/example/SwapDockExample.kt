package ui.example

import tornadofx.*


class SwapView1: View() {
    override val root = vbox {
        textfield("Input something") {
            textProperty().addListener { obs, old, new ->
                println("You typed: $new")
            }
        }
        button("Go to SwapView2") {
            action {
                replaceWith<SwapView2>()
            }
        }
    }

    override fun onDock() {
        println("Docking SwapView1!")
    }

    override fun onUndock() {
        println("Undocking SwapView1!")
    }
}

class SwapView2: View() {
    override val root = vbox {
        button("Go to SwapView1") {
            action {
                replaceWith<SwapView1>()
            }
        }
    }

    override fun onDock() {
        println("Docking SwapView2!")
    }
    override fun onUndock() {
        println("Undocking SwapView2!")
    }
}