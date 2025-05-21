package main;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

import model.Dog;

public class Main extends Application
{
    private static final double WIDTH = 640;
    private static final double HEIGHT = 480;

    public static void main(String[] args)
    {
        Dog jeff = new Dog("Jeff", 5);
        System.out.println(jeff.toString());
        System.out.println(jeff.name() + " is " + jeff.age() + " year(s) old.");

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
