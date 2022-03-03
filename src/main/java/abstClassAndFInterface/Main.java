package abstClassAndFInterface;

public class Main {

    AbstClass a = new AbstClass() {
        @Override
        public void test() {

        }
    };


    TestInt i = new TestInt() {
        @Override
        public void test() {

        }
    };

    // AbstClass ab = () -> System.out.println("bla"); лямда выражения не разрешены для абстрактных классов

    TestInt ii = () -> System.out.println("bla");
}
