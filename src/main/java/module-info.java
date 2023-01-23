module com.grabukm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.grabukm to javafx.fxml;
    exports com.grabukm;
}
