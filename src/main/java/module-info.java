module com.example.javafxform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxform to javafx.fxml;
    exports com.example.javafxform;
}