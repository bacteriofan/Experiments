package inter;

public class Driver implements Driv {

    @Override
    public Driv1 show() {
        return new NewShow();
    }

    class NewShow implements Driv1 {

        @Override
        public Print printDrive1() {
            return new ConcretePrintMe();
        }
    }

    class ConcretePrintMe implements Print{

        @Override
        public Print PrintAll() {
            System.out.println("hiiiiiiii");
            return this;
        }
    }
}
