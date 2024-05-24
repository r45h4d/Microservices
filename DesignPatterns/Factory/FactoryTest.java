package Factory;

import static Factory.WatchType.ANALOG;

public class FactoryTest {
    public static void main(String[] args) {
        var analogWatchFactory = createWatchFactoryByWatchType(ANALOG);
        var analogWatch = analogWatchFactory.createWatch();
        analogWatch.showTime();
    }

    private static WatchFactory createWatchFactoryByWatchType(WatchType watchType){
        return switch (watchType){
            case ANALOG -> new AnalogWatchFactory();
            case DIGITAL -> new DigitalWatchFactory();
        };
    }
}
