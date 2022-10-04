module com.example.tempcontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tempcontroller to javafx.fxml;
    exports com.example.tempcontroller;
}