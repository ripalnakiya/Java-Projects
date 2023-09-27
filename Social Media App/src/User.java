import java.util.ArrayList;

public class User {
    private String username;
    private int userId;
    private ArrayList<Post> posts;

    public User(String username, int userId) {
        this.username = username;
        this.userId = userId;
        this.posts = new ArrayList<Post>();
    }

    // We're returning the post, so that we cann add it to the feed
    public Post addPost(String postText) {
        Post pst = new Post(postText);
        posts.add(pst);
        return pst;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public String toString() {
        StringBuilder sbPosts = new StringBuilder("");
        int counter = 1;
        for (Post p : posts) {
            sbPosts.append("\n" + counter + ". " + p.toString());
            counter++;
        }
        if (sbPosts.isEmpty())
            sbPosts.append("No Posts");
        return "\nUser Name: " + username + "\nUser Id: " + (userId + 1) + "\nPosts: " + sbPosts;
    }
}