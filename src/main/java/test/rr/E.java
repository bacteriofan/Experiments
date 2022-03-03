package test.rr;

class E {
    public int x = 5;
    void foo() {
        System.out.println(x);
    }
}
class F extends E {
    int x = 6;

}
class Ma {
    public static void main(String args[]) {
        F b = new F();
        System.out.println(b.x); // 6
        System.out.println(((E)b).x); // 5
        b.foo(); // 5 метод foo наследуется, но не переопределяется, поэтому он вызывется из класса Е с переменной из класса Е
    }
}