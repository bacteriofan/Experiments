import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        Set c = new HashSet();
        print(c);
    }

    public static void print(Set s) {
        System.out.println("Set");
    }

    public static void print(Collection c) {
        System.out.println("Collection");
    }

    public static void print(HashSet hs) {
        System.out.println("HashSet");
    }
}