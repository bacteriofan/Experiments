package inter;

public interface Driv {

    Driv1 show();

    interface Driv1 {
        Print printDrive1();
    }

    interface Print {
        Print PrintAll();
    }
}
