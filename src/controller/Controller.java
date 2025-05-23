package controller;

import javafx.scene.layout.Region;
import model.Model;
import interactor.Interactor;
import view.View;

public class Controller
{
    private final Region view;

    public Controller()
    {
        Model viewModel = new Model();
        Interactor interactor = new Interactor(viewModel);
        view = new View(viewModel, interactor::addFive);
    }

    public Region getView() { return view; }
}