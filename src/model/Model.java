package model;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class Model
{
    private final StringProperty number = new SimpleStringProperty("0");
    private final BooleanProperty moreAllowed = new SimpleBooleanProperty(true);

    public String getNumber() { return number.get(); }

    public StringProperty numberProperty() { return number; }

    public void setNumber(String number) { this.number.set(number); }

    boolean isMoreAllowed() { return moreAllowed.get(); }

    public BooleanProperty moreAllowedProperty() { return moreAllowed; }

    void setMoreAllowed(boolean moreAllowed)
    {
        this.moreAllowed.set(moreAllowed);
    }
}
