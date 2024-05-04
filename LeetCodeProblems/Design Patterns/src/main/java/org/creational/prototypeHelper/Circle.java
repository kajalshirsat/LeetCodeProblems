package org.creational.prototypeHelper;

import org.creational.Prototype;

public class Circle extends Prototype {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle Prototype2 = (Circle) object2;
        return Prototype2.radius == radius;
    }
}
