package org.creational;

import org.creational.factoryHelper.Button;
import org.creational.factoryHelper.HtmlDialog;
import org.creational.factoryHelper.WindowsDialog;

/*
Factory Method(Virtual Constructor) is a creational design pattern that provides an interface for creating objects in a superclass,
but allows subclasses to alter the type of objects that will be created.

 Pros:
 You avoid tight coupling between the creator and the concrete products.
 Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
 Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

 Cons:
 The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

 Implementation:
 FactoryDialog is an abstract class with an abstract create method and other behavioural methods.
 Button class - interface. Windows Button and Html Button implements Button.
 WindowsDialog and HtmlDialog extends FactoryDialog and only creates of required object.

Usage -
java.util.Calendar#getInstance()
java.util.ResourceBundle#getBundle()
java.text.NumberFormat#getInstance()
java.nio.charset.Charset#forName()
java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns different singleton objects, depending on a protocol)
java.util.EnumSet#of()
javax.xml.bind.JAXBContext#createMarshaller() and other similar methods.



 */

//MUST- abstract class
public abstract class FactoryDialog {


    /**
     * Base factory class. Note that "factory" is merely a role for the class. It
     * should have some core business logic which needs different products to be
     * created.
     */

        public void renderWindow() {
            // ... other code ...

            Button okButton = createButton();
            okButton.render();
        }

        /**
         * Subclasses will override this method in order to create specific button
         * objects.
         */
        public abstract Button createButton();

    public static void main(String[] args) {
        FactoryDialog fac;
        if (System.getProperty("os.name").equals("Windows 10")) {
            fac = new WindowsDialog();
        } else {
            fac = new HtmlDialog();
        }
        fac.renderWindow();
    }

}
