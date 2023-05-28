package Models;

public class Group {
    private String name;
    private String description;
    private DateTime creationDate;
    private String suspendedReason;
    private boolean isSuspended;

    public Group() {
    }

    public Group(String name, String description, DateTime creationDate, String suspendedReason, boolean isSuspended) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.suspendedReason = suspendedReason;
        this.isSuspended = isSuspended;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getSuspendedReason() {
        return suspendedReason;
    }

    public void setSuspendedReason(String suspendedReason) {
        this.suspendedReason = suspendedReason;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", suspendedReason='" + suspendedReason + '\'' +
                ", isSuspended=" + isSuspended +
                '}';
    }
}
