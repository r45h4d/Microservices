package Factory;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AnalogWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println("Current time on analog watch is " + LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm")));
    }
}
