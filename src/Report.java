import java.util.Date;

public class Report {
    private int reportCode;
    private Date reportDate;

    public Report(int reportCode, Date reportDate) {
        this.reportCode = reportCode;
        this.reportDate = reportDate;
    }

    public int getReportCode() {
        return reportCode;
    }

    public void setReportCode(int reportCode) {
        this.reportCode = reportCode;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public void viewReports() {
        System.out.println("Report Code: " + reportCode);
        System.out.println("Report Date: " + reportDate);
    }

    public void createReports() {
        // create report logic
    }
}
