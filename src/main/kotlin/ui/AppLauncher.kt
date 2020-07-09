package ui

import tornadofx.App
import ui.detail.UserDetailView
import ui.login.LoginView
import ui.main.MainView

class AppLauncher: App(UserDetailView::class)