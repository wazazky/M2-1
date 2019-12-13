

import javafx.application.Application;
import static java.lang.System.exit;
import javafx.scene.Scene;

import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;




import javafx.scene.control.Button;

import javafx.scene.layout.Pane;

import java.io.IOException;


public class Main extends Application {
    public static int tam=5;
    @Override
    public void start(Stage primaryStage) throws Exception, ClassNotFoundException{
        Pane root = new Pane();
        Button btn= new Button("Generar nueva lista de valores");
       // btn.setPrefSize(100,80);
        btn.setLayoutX(100);btn.setLayoutY(100);
        Button btn1= new Button("Guardar Lista");
      //  btn.setPrefSize(100,80);
        btn1.setLayoutX(100);btn1.setLayoutY(btn.getLayoutY()+25);
        Button btn2= new Button(" Leer Lista");
       //btn.setPrefSize(100,80);
        btn2.setLayoutX(100);btn2.setLayoutY(btn1.getLayoutY()+25);
        Button btn3= new Button( "Mostrar Lista");
       // btn.setPrefSize(100,80);
        btn3.setLayoutX(100);btn3.setLayoutY(btn2.getLayoutY()+25);
        Button btn4= new Button("Salir");
        //btn.setPrefSize(100,80);
        btn4.setLayoutX(100);btn4.setLayoutY(btn3.getLayoutY()+25);



        root.setPrefSize(1024,768);
        primaryStage.setTitle("Hola mundo");


        Text texto1=new Text("");
        texto1.setVisible(true);
        texto1.setX(200);
        texto1.setY(220);
        texto1.setFill(Color.GREEN);
        texto1.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 25));

        Text texto2=new Text("");
        texto2.setVisible(true);
        texto2.setX(280);
        texto2.setY(112);
        texto2.setFill(Color.RED);
        texto2.setFont(Font.font("Tw Cen MT Condensed", FontWeight.SEMI_BOLD, 70));
        Jugador[] listas = new Jugador[tam];
               btn.setOnMouseClicked(e ->{
                   texto2.setText("estado \n"+Jugador.GLR(listas));
        });
               btn1.setOnMouseClicked(e ->{
                   texto2.setText("estado \n"+Jugador.Grabar(listas));
        });
               btn2.setOnMouseClicked(e ->{
                   try {
                       texto2.setText(Jugador.Leer(listas));

                   } catch (ClassNotFoundException ex ) {
                       ex.printStackTrace();
                   }
               });
               btn3.setOnMouseClicked(e ->{
                   try {
                       texto1.setText(Jugador.MostrarToString(listas));
                   } catch (IOException ex) {
                       ex.printStackTrace();
                   }
               });
               btn4.setOnMouseClicked(e ->{
                   exit(0);
        });

        primaryStage.setScene(new Scene(root, 1024, 768));
        root.getChildren().addAll(texto1,texto2,btn,btn1,btn2,btn3,btn4);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
