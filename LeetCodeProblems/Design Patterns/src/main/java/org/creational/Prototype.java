package org.creational;

import org.creational.prototypeHelper.Circle;
import org.creational.prototypeHelper.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Prototype {

    /*
    Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

 Pros:
 You can clone objects without coupling to their concrete classes.
 You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
 You can produce complex objects more conveniently.
 You get an alternative to inheritance when dealing with configuration presets for complex objects.

 Cons:
 Cloning complex objects that have circular references might be very tricky.

 Implementation:
 Prototypes - an abstract class with clone and equal method
 Circle & Rectangle - extends abstract class Prototype.
     */

    public int x;
    public int y;
    public String color;

    public Prototype() {
    }

    public Prototype(Prototype target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Prototype clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Prototype)) return false;
        Prototype Prototype2 = (Prototype) object2;
        return Prototype2.x == x && Prototype2.y == y && Objects.equals(Prototype2.color, color);
    }

    public static void main(String[] args) {
        List<Prototype> Prototypes = new ArrayList<>();
        List<Prototype> PrototypesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        Prototypes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        Prototypes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        Prototypes.add(rectangle);

        cloneAndCompare(Prototypes, PrototypesCopy);
    }

    private static void cloneAndCompare(List<Prototype> Prototypes, List<Prototype> PrototypesCopy) {
        for (Prototype Prototype : Prototypes) {
            PrototypesCopy.add(Prototype.clone());
        }

        for (int i = 0; i < Prototypes.size(); i++) {
            if (Prototypes.get(i) != PrototypesCopy.get(i)) {
                System.out.println(i + ": Prototypes are different objects (yay!)");
                if (Prototypes.get(i).equals(PrototypesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Prototype objects are the same (booo!)");
            }
        }
    }


}
