package nestedClasses;

import static nestedClasses.NestedInnerClass.*;

public class Main {
    public static void main(String[] args) {
        NestedInnerClass.Inner outer = new NestedInnerClass().new Inner(); //not static class
        //StaticInner stClass = new StaticInner();
        outer.calculate();

        NestedInnerClass k = new NestedInnerClass();
        k.localInnerClassDemo();
        k.test();

    }
}
