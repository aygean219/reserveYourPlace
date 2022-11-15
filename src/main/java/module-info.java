module com.example.proiectcolectiv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proiectcolectiv to javafx.fxml;
    exports com.example.proiectcolectiv;
}