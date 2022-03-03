package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getSingleton();
        s.print();
    }
}
