package nestedClasses;

import org.apache.commons.lang.RandomStringUtils;

public class NestedInnerClass {

    int local = 1;
    int local2 = local + 1;

    String generatedString = RandomStringUtils.random(10, true, false);

    public static class StaticInner {
        public String pubString = "public";
        private String prString = "private";

        public void printPrString() {
            System.out.println(prString);
            //System.out.println(generatedString); cannot access the field because it is not effectively final
        }
    }

    public class Inner {
        public String pubString = "public";
        private String prString = "private";

        public void calculate() {
            System.out.println(local2);
        }

    }

    public void localInnerClassDemo() {
        final int innerVar = 1; //can be accessed by the inner class because it is final (or effectively final)
        int result = 1;
        class LocalInnerClass {
            private void calculate(int result) {
                System.out.println(result + innerVar);
            }
        }
        new LocalInnerClass().calculate(result);
    }


    public void test() {
        new StaticInner().printPrString();
    }
}
