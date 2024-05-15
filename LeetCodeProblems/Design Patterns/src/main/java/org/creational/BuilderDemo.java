package org.creational;

import org.creational.builderHelper.*;

public class BuilderDemo {

    /*
    Builder is a creational design pattern that lets you construct complex objects step by step.
    The pattern allows you to produce different types and representations of an object using the same construction code.

 Pros:
 You can construct objects step-by-step, defer construction steps or run steps recursively.
 You can reuse the same construction code when building various representations of products.
 Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

 Cons:
 The overall complexity of the code increases since the pattern requires creating multiple new classes.

 Implementation:

 Usage :
java.lang.StringBuilder#append() (unsynchronized)
java.lang.StringBuffer#append() (synchronized)
java.nio.ByteBuffer#put() (also in CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)
javax.swing.GroupLayout.Group#addComponent()
All implementations java.lang.Appendable

 */


    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
