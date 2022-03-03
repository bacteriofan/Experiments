package test;

public class Parent {

    public String test = "parent";
    String test2 = "only parent";
    private String unique = "parent";
    String parentField = "parent";
    private String hideField = "parent";
    String hideField2 = "parent field";

    public static String staticString = "parent static string";

    public static void staticMethod() {
        System.out.println("parent static");
    }

    public void parent() {
        System.out.println("paranet");

    }

    protected void over() {
        System.out.println("parent");
    }

    final protected void finalParent() {
        System.out.println("parent");
    }

    protected void checkFields() {
        System.out.println(hideField);
    }

    protected void checkFields2() {
        System.out.println("parent");
    }

    protected void checkFields3() {
        System.out.println("lol");
    }
}
