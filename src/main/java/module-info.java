module com.example.trucker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trucker to javafx.fxml;
    exports com.example.trucker;
}