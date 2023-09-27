import java.util.ArrayList;

public class Post {
    private String postText;
    private ArrayList<Comment> comments;

    public Post(String postText) {
        this.postText = postText;
        comments = new ArrayList<Comment>();
    }

    public String getPostText() {
        return postText;
    }

    public void addComment(String commentText) {
        Comment cmt = new Comment(commentText);
        comments.add(cmt);
    }

    public String toString() {
        StringBuilder sbComments = new StringBuilder("");
        int counter = 1;
        for (Comment c : comments) {
            sbComments.append(counter + ". " + c.toString());
            counter++;
        }
        if (sbComments.isEmpty())
            sbComments.append("No Comments");

        return "Post:\"" + postText + "\"\n\tComments:" + sbComments;
    }
}
