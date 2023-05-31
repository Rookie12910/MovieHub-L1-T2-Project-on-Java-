module com.example.projectfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projectfx to javafx.fxml;
    exports com.example.projectfx;
}