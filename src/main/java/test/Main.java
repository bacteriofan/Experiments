package test;

public class Main {
    public static void main(String[] args) {
        Child c = new Child(); // доступны все все поля и методы из родителя
        Parent p = new Child(); // доступны методы и поля только родителя, но если они переопределены, то вызываются методы child
        Parent pp = new Parent();


        p.over(); //переопределен, значит будет child
        System.out.println(p.test); //должен быть выведена переменная из parent
        System.out.println(p.parentField); // доступно только переменная из

        pp.over(); // будет вызван метод parent
        System.out.println(c.test); // выдет вызван child

        //чтобы добраться до переменной test в родителе нам надо закастить объект до родителя
        Parent newC = c; // это эквивалентно  Parent p = new Child();
        System.out.println(newC.test); //должен вывестись parent

        Child newP = (Child) p; // это уже объект child, поэтому нет ошибки
        // Child newPP = (Child) pp; classCastException

        newP.over(); // это был child, то есть были доступны поля родителя, и переопределенные методы чайлда, а сейчас все должно быть доступно из чайлда
        //----------------------------
        c.finalParent();
        c.finalChild();
        p.finalParent();
        pp.finalParent();
        //-----------------------------

        c.checkFields(); // child
        p.checkFields();// child
        pp.checkFields(); // parent
        //-----------------------------

        c.checkFields2(); // parent field
        p.checkFields2(); // parent field
        pp.checkFields2(); // parent

        //-----------------------------
        p.checkFields3();

        //-----------------------------
        Parent.staticMethod();
        Child.staticMethod();
        System.out.println(Parent.staticString);
        System.out.println(Child.staticString);
    }
}
