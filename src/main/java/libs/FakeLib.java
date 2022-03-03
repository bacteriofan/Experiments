package libs;

import com.github.javafaker.Faker;

public class FakeLib {

    public static void main(String[] args) {
        Faker f = new Faker();

        System.out.println(f.animal().name());

    }
}
