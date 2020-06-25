package ui.login

import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Orientation
import tornadofx.*
import ui.login.LoginController

class LoginView() : View() {

    val username = SimpleStringProperty()
    val password = SimpleStringProperty()

    val loginController by inject<LoginController>()

    override val root = form() {
        title = "Login"
        fieldset("Login") {
            labelPosition = Orientation.VERTICAL
            field("Username") {
                textfield(username)
            }
            field("Password") {
                passwordfield (password)
            }
        }
        button("Login") {
            setOnAction {
                loginController.login(username.toString(), password.toString())
            }
        }

    }

}