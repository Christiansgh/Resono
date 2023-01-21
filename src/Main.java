package src;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/*
 * TODO:
 * button hover => scale.
 * 
 * popout sidebar = pane.setVisible(false);
 */
public class Main extends Application {
   public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //Change the name of the app
        stage.setTitle("Resono");

        //Set the icon of the app
        stage.getIcons().add(new Image("/assets/images/ResonoLogo.png"));

        //setScene(stage, "Test.fxml");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/assets/fxml/home.FXML"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    } 
}