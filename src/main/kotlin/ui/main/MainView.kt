package ui.main

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import model.User
import model.getDefaultUser
import tornadofx.*

class MainView: View() {

    val sortOptions = FXCollections.observableArrayList("username", "last updated", "friend added")
    // todo: remove this
    private val userList : ObservableList<User> = observableListOf(List(5) { getDefaultUser(it)})

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
            center = FriendOverviewList(userList).root
        }
    }

}