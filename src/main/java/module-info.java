module com.example.provaaaa {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.provaaaa to javafx.fxml;
    exports com.example.provaaaa;
}