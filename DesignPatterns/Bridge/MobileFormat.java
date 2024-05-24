package Bridge;

public class MobileFormat implements ReportFormat{
    @Override
    public void generate() {
        System.out.println("Report in mobile format");
    }
}
