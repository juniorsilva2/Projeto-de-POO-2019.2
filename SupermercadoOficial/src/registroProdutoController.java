package controllers;


import aplication.Caixa;
import aplication.MainScreen;
import aplication.RegistrarProduto;
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

public class registroProdutoController implements Initializable {


    @FXML Button btnCancelar;

    public void close() {
        RegistrarProduto.getStage().close();
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

    public void start(Stage primaryStage) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btnCancelar.setOnMouseClicked((MouseEvent) -> {


            try {

                close();


            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnCancelar.setOnKeyPressed((KeyEvent e) -> {
            if (KeyCode.ENTER == e.getCode()) {
                close();
            }
        });

    }
}