package Models;

public class Reaction {
    private ReactionType reactionType;
    private LocalDate timeStamp;

    public Reaction() {
    }

    public Reaction(ReactionType reactionType, LocalDate timeStamp) {
        this.reactionType = reactionType;
        this.timeStamp = timeStamp;
    }

    public ReactionType getReactionType() {
        return reactionType;
    }

    public void setReactionType(ReactionType reactionType) {
        this.reactionType = reactionType;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    @java.lang.Override
    public java.lang.String toString() {
        return "Reaction{" +
                "reactionType=" + reactionType +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
