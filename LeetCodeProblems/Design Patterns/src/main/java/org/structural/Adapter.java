package org.structural;

import org.structural.adapterHelper.RoundHole;
import org.structural.adapterHelper.RoundPeg;
import org.structural.adapterHelper.SquarePeg;

public class Adapter extends RoundPeg{
    /*
    Adaptor(Wrapper) is a structural design pattern that allows objects with incompatible interfaces to collaborate.

 Pros:
 Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
 Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

 Cons:
 The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.
 Duplicate code smells

 Implementation:
 RoundHole: class that has a radius and check if a pegs fits in it
 RoundPeg: class with a radius, getters and constructor
 SquarePeg: class with a sq. width, getters and constructor
 SquarePegAdapter: a class with a SquarePeg and converts width to radius
 ( it EXTENDS RoundPeg to be compatible with fits method in RoundHole)

 Usage:
java.util.Arrays#asList()
java.util.Collections#list()
java.util.Collections#enumeration()
java.io.InputStreamReader(InputStream) (returns a Reader object)
java.io.OutputStreamWriter(OutputStream) (returns a Writer object)
javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()

     */

    private SquarePeg s;

    public int getRadius(){
        return (int)Math.pow(s.getWidth()/2,2);
    }

    public Adapter(SquarePeg s){
        this.s = s;
    }

    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        Adapter smallSqPegAdapter = new Adapter(smallSqPeg);
        Adapter largeSqPegAdapter = new Adapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
