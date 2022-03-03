package patterns.decorator;

public class Main {
    /**
     A more flexible approach is to put the component in another object called the patterns.decorator.
     The Decorator is a structural pattern used to add new responsibilities to an object dynamically without extending functionality.
     That lets you dynamically change the behavior of an object at runtime by wrapping it in an object of a patterns.decorator class.
     Decorators are used for adding some behavior that is not part of the core functionality to all interface methods.
     */

    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                new SeniorJavaDeveloper(
                        new JavaDeveloper()));

        System.out.println(developer.makeJob());

        Developer d = new SeniorJavaDeveloper(new JavaDeveloper());

    }
}
