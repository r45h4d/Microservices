package Bridge;

public class WebFormat implements ReportFormat{
    @Override
    public void generate() {
        System.out.println("Report in web format");
    }
}
