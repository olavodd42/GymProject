module com.example.gymproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires junit;

    opens com.gymproject to javafx.fxml;
    exports com.gymproject;
}