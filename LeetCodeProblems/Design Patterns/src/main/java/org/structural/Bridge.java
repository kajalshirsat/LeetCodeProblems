package org.structural;

import org.structural.bridgeHelper.*;

public class Bridge {
    /*

 Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

 Pros:
 You can create platform-independent classes and apps.
 The client code works with high-level abstractions. It isn’t exposed to the platform details.
 Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
 Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.
 Cons:
 You might make the code more complicated by applying the pattern to a highly cohesive class.

 Implementation:
 Device- Interface
 BasicRemote, AdvanceRemote - implements Device
 Remote - Interface
 BasicRemote- implements Remote, has a Device ( data member)
 AdvancedRemote - extends BasicRemote

 Usage:
 The Bridge pattern is especially useful when dealing with cross-platform apps,
 supporting multiple types of database servers or working with several API providers of a certain kind (for example, cloud platforms, social networks, etc.)
 Identification: Bridge can be recognized by a clear distinction between some controlling entity and several different platforms that it relies on.

     */

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
