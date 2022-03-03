package test.rr;

class C {
    static int field = 1;
}
class D extends C {
    int field = 2;

    void doSomething() {
        System.out.println(super.field); // From A
        System.out.println(field); // From B
    }
}
class Main {
    public static void main(String[] args) {
        D b = new D();
        System.out.println(b.field); // From D так как поле не переопределятеся
        System.out.println(((C) b).field); // From C - статический метод
        System.out.println(C.field); // From C
        b.doSomething();
    }
}
