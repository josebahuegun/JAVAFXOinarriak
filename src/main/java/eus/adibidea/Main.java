package eus.adibidea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        VBox root = new VBox();

        Label label = new Label("Kaixoooo");

        Button adosBttn = new Button("Ados");
        Button utziBttn = new Button("Ados");


        root.getChildren().addAll(label, adosBttn, utziBttn);

        Scene scene = new Scene(root);

        stage.setTitle("JavaFX aplikazioa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(){

        launch();
    }

}
