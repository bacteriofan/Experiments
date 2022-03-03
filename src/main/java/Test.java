import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    static final List<Integer> g = new ArrayList<>(Arrays.asList(1, 2, 3));
    static final List<Integer> g2 = Arrays.asList(1, 2, 3);

    public static void main(String[] args) {
        g.add(5);
        //g2.add(5); //exception
        System.out.println(g2);
    }
}
