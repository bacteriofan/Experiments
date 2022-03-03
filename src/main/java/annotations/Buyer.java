package annotations;

public class Buyer extends Person {

    private Roles role;

    Buyer() {
        role = Roles.BUYER;
    }

    @Override
    public void getPermissions() {
        System.out.println("I am a buyer");
    }
}
