package annotations;

public class Admin extends Person {

    private Roles role;

    Admin() {
        role = Roles.ADMIN;
    }

    @Override
    public void getPermissions() {
        System.out.println("I am an admin");
    }
}
