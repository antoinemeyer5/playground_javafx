package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import controller.Controller;

public class Main extends Application
{
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new Controller().getView(), 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}