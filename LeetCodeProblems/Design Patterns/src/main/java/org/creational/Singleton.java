package org.creational;

//make the class final
public final class Singleton {

    /*
    Singleton is a creational design pattern that lets you ensure that a class has only one instance,
    while providing a global access point to this instance

    Pros:
    You can be sure that a class has only a single instance.
    You gain a global access point to that instance.
    The singleton object is initialized only when it’s requested for the first time.

    Cons:
    Violates the Single Responsibility Principle. The pattern solves two problems at the time.
    The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
    The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
    It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects.
    Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton.
    Or just don’t write the tests. Or don’t use the Singleton pattern.

    Usage:
    java.lang.Runtime#getRuntime()
    java.awt.Desktop#getDesktop()
    java.lang.System#getSecurityManager()

     */

    //MULTTHREADING - volatile is used while making the class thread-safe
    private static volatile Singleton instance;
    public String field1;

    //****MUST - make Singleton constructor private
    private  Singleton(String value){
        this.field1 = value;
    }


    //****MUST - get instance method assigns value to instance if not assigned and returns instance
    public static Singleton getInstance(String value){

        //lazy initialization - created only when required
        //MULTTHREADING - localRef is used as double check lock. it seems unnecessary but improves performance by 40%.
        Singleton localRef = instance;
        if(localRef == null){

            //MULTTHREADING - makes the class thread safe by using synchronized block
            synchronized (Singleton.class) {
                    localRef = instance = new Singleton(value);
            }
        }
        return localRef;
    }


    public static void main(String args[])
    {
        Singleton s = Singleton.getInstance("Obj1");
        Singleton s2 = Singleton.getInstance("Obj2");
        System.out.println(s.field1);
        System.out.println(s2.field1);

    }


}
