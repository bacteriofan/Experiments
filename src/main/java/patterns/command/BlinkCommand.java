package patterns.command;

public class BlinkCommand implements Command {

    private Light light;

    public BlinkCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.blink();
    }
}
