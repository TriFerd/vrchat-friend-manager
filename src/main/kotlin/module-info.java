module testmodule {
    requires javafx.controls;
    requires javafx.graphics;
    requires tornadofx;
    requires kotlin.stdlib;
    requires klaxon;
    requires ktor.client.core.jvm;
    requires kotlinx.coroutines.core;

    opens ui;
    opens ui.example;
    opens ui.login;
    opens ui.main;
    opens ui.detail;
}