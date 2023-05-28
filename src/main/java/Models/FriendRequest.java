package Models;

public class FriendRequest {
    private DateTime created_at;
    private DateTime at;
    private boolean approved;

    public FriendRequest() {
    }

    public FriendRequest(DateTime created_at, DateTime at, boolean approved) {
        this.created_at = created_at;
        this.at = at;
        this.approved = approved;
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
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "FriendRequest{" +
                "created_at=" + created_at +
                ", at=" + at +
                ", approved=" + approved +
                '}';
    }
}
