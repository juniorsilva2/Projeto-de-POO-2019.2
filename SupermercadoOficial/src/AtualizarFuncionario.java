package aplication;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import static javafx.application.Application.launch;

/**
 *
 * @author Cleuton
 */



public class AtualizarFuncionario extends Application {

    private static Stage stage;

    public static void main(String[]args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/AtualizarFuncionario.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Atualizar Funcionario");
        stage.setScene(scene);
        stage.show();
        setStage(stage);


    }




    public static Stage getStage(){
        return stage;
    }

    public static void  setStage(Stage stage){
        AtualizarFuncionario.stage= stage;
    }

}

