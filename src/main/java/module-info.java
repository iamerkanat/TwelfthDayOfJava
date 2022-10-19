module com.example.twelfthdayofjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.twelfthdayofjava to javafx.fxml;
    exports com.example.twelfthdayofjava;
}