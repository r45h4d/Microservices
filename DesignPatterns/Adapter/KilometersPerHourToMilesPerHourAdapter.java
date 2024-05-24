package Adapter;

public class KilometersPerHourToMilesPerHourAdapter implements SpeedConverter {
    int speedInKilometersPerHour;
    public KilometersPerHourToMilesPerHourAdapter(int speedInKilometersPerHour) {
        this.speedInKilometersPerHour = speedInKilometersPerHour;
    }
    @Override
    public double getSpeedByMilesPerHour() {
        return speedInKilometersPerHour * 0.621371;
    }
}
