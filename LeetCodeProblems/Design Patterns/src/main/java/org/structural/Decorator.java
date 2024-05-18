package org.structural;

import org.structural.decoratorHelper.*;

public class Decorator {
    /*
    Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

 Pros:
 You can extend an object’s behavior without making a new subclass.
 You can add or remove responsibilities from an object at runtime.
 You can combine several behaviors by wrapping an object into multiple decorators.
 Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.

 Cons:
 It’s hard to remove a specific wrapper from the wrappers stack.
 It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.
 The initial configuration code of layers might look pretty ugly.

 Implementation:
 DataSource - Interface has two methods - read and write
 FileDataSource - implements DataSource, reads file data
 DataSourceDecorator - abstract class, implements DataSource, has common method for decorators
 EncryptionDeocrator, Compression Decorator - extends DataSourceDecorator


 Usage examples: The Decorator is pretty standard in Java code, especially in code related to streams.
Here are some examples of Decorator in core Java libraries:
All subclasses of java.io.InputStream, OutputStream, Reader and Writer have constructors that accept objects of their own type.
java.util.Collections, methods checkedXXX(), synchronizedXXX() and unmodifiableXXX().
javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper

Identification: Decorator can be recognized by creation methods or constructors that accept objects of the same class or interface as a current class.

     */
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

}
