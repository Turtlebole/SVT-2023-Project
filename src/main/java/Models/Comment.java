package Models;

public class Comment {
    private String text;
    private LocalDate timeStamp;
    private boolean isDeleted;

    public Comment() {
    }

    public Comment(String text, LocalDate timeStamp, boolean isDeleted) {
        this.text = text;
        this.timeStamp = timeStamp;
        this.isDeleted = isDeleted;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", timeStamp=" + timeStamp +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
