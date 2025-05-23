package view;

import javafx.scene.layout.VBox;
import model.Model;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class View extends VBox
{

    public View(Model model, Runnable actionHandler)
    {
        TextField numberTF = new TextField();
        numberTF.textProperty().bindBidirectional(model.numberProperty());
        HBox dataBox = new HBox(4, new Label("Enter a number: "), numberTF);
        Button button = new Button("Add 5");
        button.setOnAction(evt -> actionHandler.run());
        button.disableProperty().bind(model.moreAllowedProperty().not());
        getChildren().addAll(dataBox, button);
    }
}
