package ui.login

import tornadofx.*

class LoginController: Controller() {
    fun login(username: String, password: String) {
        println("login attempted: $username $password")
    }
}