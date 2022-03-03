package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        /**
        In Strategy pattern, algorithms executed in different branches are moved into their own classes called strategies,
         all of which implement a common interface. Strategies represent behavior, not domain entities.

        The pattern has several advantages:

        it allows you to choose an algorithm (behavior) at runtime;
        it isolates the code of algorithms from the other classes, thus simplifying the addition of new algorithms;
        it lets the algorithm vary independently from clients that use it.

                To use the pattern, you should take the following steps:

         - Determine the common Strategy interface for a family of algorithms. It should contain one or more abstract methods.
         - Extract all algorithms into their own classes (concrete strategies). They should follow the Strategy interface.
         - Declare a special class called Context for storing a reference to a patterns.strategy. The context delegates execution to
         an instance of a concrete patterns.strategy through its interface, instead of implementing the behavior itself.

         Note that the interface here is not necessarily the interface in java. It can be a simple or an abstract class.
         The main thing is that it represents an abstract patterns.strategy that is inherited by concrete strategies.
         */

        Context c = new Context();
        c.setStrategy(new ConcreteStrategy1());
        c.execute();
        c.setStrategy(new ConcreteStrategy2());
        c.execute();
    }
}
