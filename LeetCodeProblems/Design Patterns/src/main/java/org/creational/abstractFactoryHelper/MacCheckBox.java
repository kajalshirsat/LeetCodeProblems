package org.creational.abstractFactoryHelper;

public class MacCheckBox implements CheckBox{

    @Override
    public void createCheckBox() {
        System.out.println("Created Mac Checkbox");
    }
}
