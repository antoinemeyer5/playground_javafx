package main;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.Parent;

import javafx.stage.Stage;

import model.Boat;

public class Main extends Application
{
    private static final double WIDTH = 640;
    private static final double HEIGHT = 480;

    public static void main(String[] args)
    {
        Boat santa_maria = new Boat("Santa Maria", 21.0f, 7.6f, 100, 40);
        Boat mayflower = new Boat("Mayflower", 30.0f, 7.6f, 189, 30);
        System.out.println(santa_maria.toString());
        System.out.println(santa_maria.crew());

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Main.fxml"));

        Scene scene = new Scene(root, WIDTH, HEIGHT);

        stage.setScene(scene);
        stage.setTitle("Playground JavaFX");
        stage.centerOnScreen();
        stage.show();
    }
}
