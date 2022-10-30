module com.example.gft4hp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gft4hp to javafx.fxml;
    exports com.example.gft4hp;
}