package org.structural;

import org.structural.compositeHelper.Circle;
import org.structural.compositeHelper.CompoundShape;
import org.structural.compositeHelper.Dot;
import org.structural.compositeHelper.Rectangle;
import org.structural.compositeHelper.ImageEditor;

import java.awt.*;

public class Composite {
    /*
    Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

 Pros:
 You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
 Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.

 Cons:
 It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.

 Implementation:
 ImageEditor : class to load the shapes
 Shape : Interface of shape
 BaseShape : abstract class that implements shape
 Dot, Circle, Rectangle : Leaf classes, extends BaseShape
 CompoundShape: Node class, extends shape, has array of shapes

 Usage examples: The Composite pattern is pretty common in Java code. It’s often used to represent hierarchies of user interface components or the code that works with graphs.
    Here are some composite examples from standard Java libraries:
    java.awt.Container#add(Component) (practically all over Swing components)
    javax.faces.component.UIComponent#getChildren() (practically all over JSF UI components)

 Identification: If you have an object tree, and each object of a tree is a part of the same class hierarchy, this is most likely a composite. If methods of these classes delegate the work to child objects of the tree and do it via the base class/interface of the hierarchy, this is definitely a composite.

     */
        public static void main(String[] args) {
            ImageEditor editor = new ImageEditor();

            editor.loadShapes(
                    new Circle(10, 10, 10, Color.BLUE),

                    new CompoundShape(
                            new Circle(110, 110, 50, Color.RED),
                            new Dot(160, 160, Color.RED)
                    ),

                    new CompoundShape(
                            new Rectangle(250, 250, 100, 100, Color.GREEN),
                            new Dot(240, 240, Color.GREEN),
                            new Dot(240, 360, Color.GREEN),
                            new Dot(360, 360, Color.GREEN),
                            new Dot(360, 240, Color.GREEN)
                    )
            );
        }
}
