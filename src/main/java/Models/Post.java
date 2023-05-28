package Models;

public class Post {
    private String comment;
    private DateTime creationDate;

    public Post() {
    }

    public Post(String comment, DateTime creationDate) {
        this.comment = comment;
        this.creationDate = creationDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Post{" +
                "comment='" + comment + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
