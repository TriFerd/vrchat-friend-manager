package ui.detail

import javafx.scene.control.SelectionMode
import model.Language
import model.User
import model.getDefaultUser
import tornadofx.*

class UserDetailView() : View() {
    private val user = getDefaultUser()
    private val languageList = user.languageList.toObservable()
    private val aliasList = user.aliasList.toObservable()

    override val root = borderpane {
        left = vbox {
            button("<<")
            label("${user.userName} (${user.age})")
            label("(${user.aliasList[1]})")
            imageview(user.getImage()) {
                isPreserveRatio = true
                fitWidth = 200.0
            }
            label ("Languages")
            for (language in languageList) {
                label("* ${language.languageName} ${language.languageLevel}")
            }
        }
        center = vbox {
            label("Notes")
            textarea()
            splitpane {

                vbox {
                    label("First Meeting")
                    textarea()
                }
                vbox {
                    label("Profile")
                    textarea() {
                        isEditable = false
                    }
                }
            }
        }
        right = vbox {
            vbox {
                label("19:00")
                label("UTC + 1:00")
                label("Germany")
            }
            label("Netherlands")
            vbox {
                label("10.02.1995")
                label("23")
            }
            for (s in aliasList) {
                label(s)
            }

        }
    }
}
