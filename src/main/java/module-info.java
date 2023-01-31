module com.grabukm {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.grabukm to javafx.fxml;
    opens com.grabukm.Controller to javafx.fxml;
    opens com.grabukm.Model to javafx.fxml;

    exports com.grabukm;
    exports com.grabukm.Controller;
    exports com.grabukm.Model;
    
}
