package fea.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        Units.initializePartners();

        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fea/app/sample.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("FE:A Inheritance Planner");

        stage.setScene(scene);
        stage.show();
    }


}