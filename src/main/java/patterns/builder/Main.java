package patterns.builder;

public class Main {
    public static void main(String[] args) {
        /**
         * Builder is a creational pattern
         */

        AlertDialogAnotherImplementation b = new AlertDialogAnotherImplementation().new Builder().setApplyButton("bla").build();

        System.out.println(b);
    }
}
