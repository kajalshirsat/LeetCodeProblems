package org.structural;

import org.structural.flyweightHelper.Forest;

import java.awt.*;

public class FlyWeight {
    /*
    Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

    Pros:
    You can save lots of RAM, assuming your program has tons of similar objects.

    Cons:
    You might be trading RAM over CPU cycles when some of the context data needs to be recalculated each time somebody calls a flyweight method.
    The code becomes much more complicated. New team members will always be wondering why the state of an entity was separated in such a way.

    Implementation:
    Forest - contains trees
    Tree - has a treetype and other params
    TreeType - refers to a tree type
    TreeFactory(Flyweight) - check if a tree not present in cached TreeTypes, add it


    Usage examples: The Flyweight pattern has a single purpose: minimizing memory intake. If your program doesn’t struggle with a shortage of RAM, then you might just ignore this pattern for a while.
    Examples of Flyweight in core Java libraries:
    java.lang.Integer#valueOf(int) (also Boolean, Byte, Character, Short, Long and BigDecimal)

    Identification: Flyweight can be recognized by a creation method that returns cached objects instead of creating new.

     */

    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
