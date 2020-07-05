package ui.main

import javafx.scene.layout.HBox
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import model.User
import tornadofx.*

class FriendOverviewCellElement(user: User) : Fragment() {
    override val root = hbox {
        imageview(user.getImage()) {
            isPreserveRatio = true
            fitWidth = 100.0
        }
        vbox {
            label(user.userName) {
                font = Font.font(font.family, FontWeight.BOLD, 20.0)
            }
            label(user.lastUserName) {
                font = Font(10.0)
            }
        }
    }
}