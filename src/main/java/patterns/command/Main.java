package patterns.command;

public class Main {
    public static void main(String[] args) {
        /**
         Behavioral pattern - decouple the logic between patterns.command and its consumers
         */

        Controller controller = new Controller();
        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        Command blink = new BlinkCommand(light);

        controller.setCommand(lightsOn);
        controller.executeCommand();

        controller.setCommand(lightsOff);
        controller.executeCommand();

        controller.setCommand(blink);
        controller.executeCommand();
    }
}
