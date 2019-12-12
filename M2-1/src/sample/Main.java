package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();
        Button btn= new Button("Switch");
        btn.setPrefSize(200,200);


        root.setPrefSize(1024,768);
        primaryStage.setTitle("Hola mundo");


        Text texto1=new Text("Encendido");
        texto1.setVisible(true);
        texto1.setX(240);
        texto1.setY(240);
        texto1.setFill(Color.GREEN);
        texto1.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 70));

        Text texto2=new Text("Apagado");
        texto2.setVisible(false);
        texto2.setX(240);
        texto2.setY(240);
        texto2.setFill(Color.RED);
        texto2.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 70));
        btn.setOnMouseClicked(e ->{
                texto2.setVisible(!texto2.isVisible());
                texto1.setVisible(!texto1.isVisible());
        });

        primaryStage.setScene(new Scene(root, 1024, 768));
        root.getChildren().addAll(texto1,texto2,btn);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
