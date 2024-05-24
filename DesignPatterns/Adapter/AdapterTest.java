package Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        int speedInKilometersPerHour = 100;
        SpeedConverter adapter = new KilometersPerHourToMilesPerHourAdapter(speedInKilometersPerHour);
        System.out.println(adapter.getSpeedByMilesPerHour());
    }
}
