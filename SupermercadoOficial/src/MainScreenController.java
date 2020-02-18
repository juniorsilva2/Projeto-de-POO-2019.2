package controllers;


import aplication.*;
import javafx.scene.Scene;
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
import netscape.security.Principal;

/**
 *
 * @author Cleuton
 */

public class MainScreenController implements Initializable {


    @FXML Button btnSair;
    @FXML Button btnHistMovimentacao;
    @FXML Button btnCadastrarCliente;
    @FXML Button btnCadastFornecedor;
    @FXML Button btnRegisProduto;
    @FXML Button btnHistVendas;
    @FXML Button btnHistCompras;
    @FXML Button btnRegisCompra;
    @FXML Button btnAcessCaixa;


    public void close() {
        MainScreen.getStage().close();
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

        btnHistMovimentacao.setOnMouseClicked((MouseEvent) -> {
                HistoricoMovimentacao histMov = new HistoricoMovimentacao();
            try {
                histMov.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnHistMovimentacao.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                HistoricoMovimentacao histMov = new HistoricoMovimentacao();
                try {
                    histMov.start(new Stage());
                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnCadastrarCliente.setOnMouseClicked((MouseEvent) -> {
            CadastroCliente cadastCliente = new CadastroCliente();
            try {
                cadastCliente.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnCadastrarCliente.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                CadastroCliente cadastCliente = new CadastroCliente();
                try {
                    cadastCliente.start(new Stage());
                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnCadastFornecedor.setOnMouseClicked((MouseEvent) -> {
            CadastroFornecedor cadastFornecedor = new CadastroFornecedor();
            try {
                cadastFornecedor.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnCadastFornecedor.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                CadastroFornecedor cadastFornecedor = new CadastroFornecedor();
                try {
                    cadastFornecedor.start(new Stage());
                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnRegisProduto.setOnMouseClicked((MouseEvent) -> {
            RegistrarProduto regisProduto = new RegistrarProduto();
            try {
                regisProduto.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnRegisProduto.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                RegistrarProduto regisProduto = new RegistrarProduto();
                try {
                    regisProduto.start(new Stage());
                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnHistVendas.setOnMouseClicked((MouseEvent) -> {
            HistoricoVendas histVendas = new HistoricoVendas();
            try {
                histVendas.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnHistVendas.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                HistoricoVendas histVendas = new HistoricoVendas();
                try {
                    histVendas.start(new Stage());
                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnHistCompras.setOnMouseClicked((MouseEvent) -> {
            HistoricoCompras histCompras = new HistoricoCompras();
            try {
                histCompras.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnHistCompras.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                HistoricoCompras histCompras = new HistoricoCompras();
                try {
                    histCompras.start(new Stage());
                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnRegisCompra.setOnMouseClicked((MouseEvent) -> {
            RegistrarCompra regCompra = new RegistrarCompra();
            try {
                regCompra.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnRegisCompra.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                RegistrarCompra regCompra = new RegistrarCompra();
                try {
                    regCompra.start(new Stage());
                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btnAcessCaixa.setOnMouseClicked((MouseEvent) -> {
            Caixa caixa = new Caixa();
            try {
                caixa.start(new Stage());
                close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnAcessCaixa.setOnKeyPressed((KeyEvent a) -> {
            if (KeyCode.ENTER == a.getCode()) {
                Caixa caixa = new Caixa();
                try {

                    close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });






    }
}