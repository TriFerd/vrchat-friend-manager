package ui.main

import javafx.collections.FXCollections
import tornadofx.*

class MainView: View() {

    val sortOptions = FXCollections.observableArrayList("username", "last updated", "friend added")

    override val root = borderpane() {
        top = hbox {
            combobox<String> {
                items = sortOptions
                selectionModel.selectFirst()
            }
            textfield() {
                promptText = "Search"
            }
            button("Search") {

            }
            vbox {
                button("Refresh") {
                    fitToParentWidth()
                }
                label("11:12 25.06.2020")
            }
            button("Settings") {

            }
            center = label("user list")
        }
    }

}