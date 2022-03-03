package annotations;

public class Person {

    private Roles role;

    Person() {
        role = Roles.DEFAULT;
    }

    public Roles getRole() {
        return role;
    }

    public void getPermissions() {
        System.out.println("I am a person");
    }
}
