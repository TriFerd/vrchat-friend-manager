module testmodule {
    requires javafx.controls;
    requires javafx.graphics;
    requires tornadofx;
    requires kotlin.stdlib;
    opens ui;
    opens ui.example;
    opens ui.login;
    opens ui.main;
}