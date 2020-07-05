package ui.main

import javafx.collections.ObservableList
import javafx.scene.control.ListView
import model.User
import tornadofx.*

class FriendOverviewList(items: ObservableList<User>) : View() {
    override val root = ListView<User>(items)

    init {
        root.cellFormat {
            graphic = FriendOverviewCellElement(it).root
        }
    }
}