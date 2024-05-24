package Factory;

public class AnalogWatchFactory implements WatchFactory{
    @Override
    public Watch createWatch() {
        return new AnalogWatch();
    }
}
