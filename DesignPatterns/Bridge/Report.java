package Bridge;

public abstract class Report {
    public ReportFormat reportFormat;

    public Report(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public abstract void display();
}
