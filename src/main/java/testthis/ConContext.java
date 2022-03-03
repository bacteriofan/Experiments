package testthis;

public class ConContext implements Context {

    public String lol;

    public ConContext(String lol) {
        this.lol = lol;
    }

    @Override
    public void cont() {
    }

    public void getThis() {
        Side s = new Side();
        s.sidemethod(this);
    }
}
