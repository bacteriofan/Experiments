package patterns.facade;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         Facade provides a unified interface to a group of subsystem interfaces for you as a client and makes using the
         main system easier. Think of a car: when you insert a key and start it, there are subsystems that should be
         activated — the engine, the heated seats and your stereo system. When you arrive at your destination, you turn
         off the car and thus turn off the engine, the heated seats and the stereo.

         !provides client isolation from the system components
         */

        Engine engine = new Engine();
        StereoSystem stereoSystem = new StereoSystem();
        HeatedSeats heatedSeats = new HeatedSeats();

        CarFacade carFacade = new CarFacade(engine, heatedSeats, stereoSystem);

        carFacade.turnOnCar();
        System.out.println();
        for (int i = 0; i < 6; i++) {
            Thread.sleep(1500);
            System.out.println("Driving to work... " + i + "km");
            switch (i) {
                case 1:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - Bohemian Rhapsody");
                    break;
                case 2:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - I want to break free");
                    break;
                case 3:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - Another one bites the dust");
                    break;
                case 4:
                    Thread.sleep(500);
                    carFacade.playTrack("Queen - Scandal");
                    break;
                case 5:
                    Thread.sleep(500);
                    carFacade.increaseHeatedSeats();
                    break;
            }
        }
        System.out.println("\nWe have arrived");
        Thread.sleep(1000);
        carFacade.turnOffCar();
    }
}
