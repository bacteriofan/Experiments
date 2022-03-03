package patterns.decorator;

public class DeveloperDecorator implements Developer {

    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    public String makeJob() {
        return developer.makeJob();
    }
}