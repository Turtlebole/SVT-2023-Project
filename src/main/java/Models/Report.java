package Models;

public class Report {
    private ReasonReport reasonReport;
    private LocalDate timeStamp;
    private User byUser;
    private boolean isAccepted;

    public Report() {
    }

    public Report(ReasonReport reasonReport, LocalDate timeStamp, User byUser, boolean isAccepted) {
        this.reasonReport = reasonReport;
        this.timeStamp = timeStamp;
        this.byUser = byUser;
        this.isAccepted = isAccepted;
    }

    public ReasonReport getReasonReport() {
        return reasonReport;
    }

    public void setReasonReport(ReasonReport reasonReport) {
        this.reasonReport = reasonReport;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public User getByUser() {
        return byUser;
    }

    public void setByUser(User byUser) {
        this.byUser = byUser;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Report{" +
                "reasonReport=" + reasonReport +
                ", timeStamp=" + timeStamp +
                ", byUser=" + byUser +
                ", isAccepted=" + isAccepted +
                '}';
    }
}
