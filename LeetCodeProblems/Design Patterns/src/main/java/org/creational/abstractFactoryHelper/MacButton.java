package org.creational.abstractFactoryHelper;

public class MacButton implements Button{

    @Override
    public void createButton() {
        System.out.println("Created Mac Button");
    }
}
