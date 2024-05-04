package org.creational.abstractFactoryHelper;

public class WindowsButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Created Win Button");
    }
}
