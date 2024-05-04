package org.creational.abstractFactoryHelper;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void createCheckBox() {
        System.out.println("Created Win Checkbox");
    }
}
