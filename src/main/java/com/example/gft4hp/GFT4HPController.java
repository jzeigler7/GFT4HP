package com.example.gft4hp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GFT4HPController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onGFT4HPButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}