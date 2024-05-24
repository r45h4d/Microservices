package Bridge;

public class SalesReport extends Report{
    public SalesReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("Sales report");
        reportFormat.generate();
    }

}
