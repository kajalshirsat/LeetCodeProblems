package org.creational.abstractFactoryHelper;


public class MacFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
