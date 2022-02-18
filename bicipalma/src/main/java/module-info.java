module com.example.bicipalma {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bicipalma to javafx.fxml;
    exports com.example.bicipalma;
}