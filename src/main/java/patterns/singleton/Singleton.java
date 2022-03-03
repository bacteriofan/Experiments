package patterns.singleton;

public class Singleton {

    public static Singleton s;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }

    public void print() {
        System.out.println("patterns/singleton");
    }
}
