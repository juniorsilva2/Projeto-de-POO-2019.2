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



        public class LoginCaixa extends Application {

              private static Stage stage;

              public static void main(String[]args){
                  launch(args);
              }

              @Override
              public void start(Stage stage) throws Exception {
                  Parent root = FXMLLoader.load(getClass().getResource("/views/loginCaixa.fxml"));
                  Scene scene = new Scene(root);
                stage.setTitle("Login Caixa");
                stage.setScene(scene);
                stage.show();
                setStage(stage);


             }




             public static Stage getStage(){
                  return stage;
             }

             public static void  setStage(Stage stage){
                  LoginCaixa.stage= stage;
             }

}
