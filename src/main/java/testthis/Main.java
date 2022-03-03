package testthis;

import org.testng.annotations.Test;

public class Main {

    @Test
    public void  ob() {
        ConContext g = new ConContext("first");
        g.getThis();

        ConContext r = new ConContext("second");
        r.getThis();


    }
}
