package main;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

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
    public void start(Stage stage)
    {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        BorderPane layoutManager = new BorderPane();
        layoutManager.setLeft(new Button("Left button"));
        layoutManager.setCenter(new Label("JavaFX " + javafxVersion + ", running on Java " + javaVersion));
        layoutManager.setRight(new Button("Right button"));

        Scene scene = new Scene(layoutManager, WIDTH, HEIGHT);

        stage.setScene(scene);
        stage.setTitle("Playground JavaFX");
        stage.centerOnScreen();
        stage.show();
    }
}
