class User {

    public static int counter = 0;

    public final String username;

    public User (String username) {
        this.username = username;
        User.counter++;
    }

}