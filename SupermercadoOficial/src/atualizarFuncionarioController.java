package controllers;



import aplication.AtualizarFuncionario;
import aplication.MainScreen;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Cleuton
 */

public class atualizarFuncionarioController implements Initializable {

    @FXML TextField inputNome;
    @FXML TextField inputTelefone1;
    @FXML TextField inputTelefone2;
    @FXML TextField inputEndereco;
    @FXML TextField inputDatNasc;
    @FXML Button btnAtualizar;
    @FXML Button btnCancelar;


    public void close(){
        AtualizarFuncionario.getStage().close();
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



        btnCancelar.setOnMouseClicked((MouseEvent) ->{


            try {

                close();




            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnCancelar.setOnKeyPressed((KeyEvent e) -> {
            if (KeyCode.ENTER == e.getCode()){
                close();
            }
        });
    }
}