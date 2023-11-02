module com.gymproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.junit.jupiter.api;

    requires javafx.base;
    requires javafx.graphics;
    requires hamcrest.core;
    requires java.desktop;

    opens com.gymproject to javafx.fxml;
    exports com.gymproject;
}