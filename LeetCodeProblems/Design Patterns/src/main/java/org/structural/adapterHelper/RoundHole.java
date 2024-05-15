package org.structural.adapterHelper;

public class RoundHole {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public RoundHole(int radius){
        this.radius = radius;
    }

    public boolean fits(RoundPeg r){
        return (r.getRadius() <= this.radius);
    }
}
