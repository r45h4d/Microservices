package Bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Report employeeReport = new EmployeeReport(new WebFormat());
        employeeReport.display();

        Report salesReport = new SalesReport(new MobileFormat());
        salesReport.display();
    }
}
