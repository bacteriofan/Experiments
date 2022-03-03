package test.rr;

public class A
{
    public int ID = 42;

    public void inheritedMethod() {
        System.out.println(ID);
    }
}

class B extends A {
    public int ID;

    public static void main(String[] args) {
        B b = new B();
        b.ID = 1;
        b.inheritedMethod(); // будет выведено 42
    }
}