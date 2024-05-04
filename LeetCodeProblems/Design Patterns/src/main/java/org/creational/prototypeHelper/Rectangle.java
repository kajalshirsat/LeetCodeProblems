package org.creational.prototypeHelper;

import org.creational.Prototype;

public class Rectangle extends Prototype {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle Prototype2 = (Rectangle) object2;
        return Prototype2.width == width && Prototype2.height == height;
    }
}
