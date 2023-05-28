package Models;

public class GroupRequest {
    private DateTime created_at;
    private DateTime at;
    private boolean isApproved;

    public GroupRequest() {
    }

    public GroupRequest(DateTime created_at, DateTime at, boolean isApproved) {
        this.created_at = created_at;
        this.at = at;
        this.isApproved = isApproved;
    }

    public DateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(DateTime created_at) {
        this.created_at = created_at;
    }

    public DateTime getAt() {
        return at;
    }

    public void setAt(DateTime at) {
        this.at = at;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "GroupRequest{" +
                "created_at=" + created_at +
                ", at=" + at +
                ", isApproved=" + isApproved +
                '}';
    }
}
