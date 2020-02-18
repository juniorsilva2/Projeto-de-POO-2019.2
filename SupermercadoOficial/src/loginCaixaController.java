package controllers;


import aplication.Caixa;
import aplication.MainScreen;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Cleuton
 */

public class loginCaixaController implements Initializable {


    @FXML
    Button btnSair;


    public void close() {
        Caixa.getStage().close();
        retornaPrincipal();
    }

    public void retornaPrincipal(){
        try {
            MainScreen principal = new MainScreen();
            principal.start(new Stage());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        btnSair.setOnMouseClicked((MouseEvent) -> {


            try {

                close();


            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnSair.setOnKeyPressed((KeyEvent e) -> {
            if (KeyCode.ENTER == e.getCode()) {
                close();
            }
        });
    }
}
