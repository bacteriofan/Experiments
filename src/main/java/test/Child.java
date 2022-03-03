package test;

public class Child extends Parent {

    public String test = "child";
    String test3 = "only  child";
    String childString = "chid";
    private String hideField = "child";
    private String hiddenValue;

    public static String staticString = "child static string";

    public static void staticMethod() {
        System.out.println("child static");
    }

    public void addition() {
    }

    public void over() {
        System.out.println("child");
    }

    final protected void finalChild() {
        System.out.println("child");
    }

    protected void checkFields() {
        System.out.println(hideField);
    }

    protected void checkFields2() {
        System.out.println(super.hideField2);
    }

    protected void checkFields3() {
        System.out.println(hiddenValue);
    }
}
