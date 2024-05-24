package Bridge;

public class EmployeeReport extends Report{
    public EmployeeReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("Employee report");
        reportFormat.generate();
    }
}
