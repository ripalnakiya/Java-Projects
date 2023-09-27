public class Comment {
    private String commentText;

    public Comment(String commentText) {
        this.commentText = commentText;
    }

    public String toString() {
        return commentText + "\n";
    }
}
