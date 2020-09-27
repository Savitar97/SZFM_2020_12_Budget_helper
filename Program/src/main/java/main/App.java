package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/launch.fxml"));
        stage.setTitle("Budget_Helper");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.getIcons().add(new Image(getClass().getResource("/images/image.png").toExternalForm()));
        stage.show();
    }

}
