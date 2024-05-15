package org.creational;

import org.creational.abstractFactoryHelper.*;

public class AbstractFactoryDemo {
    /*

 Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

 Pros:
 You can be sure that the products you’re getting from a factory are compatible with each other.
 You avoid tight coupling between concrete products and client code.
 Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
 Open/Closed Principle. You can introduce new variants of products without breaking existing client code.

 Cons:
 The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

 Implementation:
 AbstractFactory - interface for all Factories
 WindowsFactory and MacFactory - implements AbstractFactory and creates respective components
 Button & Checkbox - interfaces of the components
 WindowsButton, WindowsCheckBox, MacButton, MacCheckBox - implementation of components

 Usage-
javax.xml.parsers.DocumentBuilderFactory#newInstance()
javax.xml.transform.TransformerFactory#newInstance()
javax.xml.xpath.XPathFactory#newInstance()



    */

    public static void main(String args[]){

        AbstractFactory fac;

        if(System.getProperty("os.name").equals("Windows"))
        {
            fac = new WindowsFactory();
        }
        else{
            fac = new MacFactory();
        }

        Button b = fac.createButton();
        CheckBox c = fac.createCheckBox();
        b.createButton();
        c.createCheckBox();
    }

}
