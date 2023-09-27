import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Post> feed = new ArrayList<Post>();
        Scanner sc = new Scanner(System.in);

        int ans = 1, option;
        User us;
        String username;
        int userId;

        Post pst;
        String pText;
        int pId;
        String commentText;
        do {
            System.out.println("************* Social Media Network *************");
            System.out.println("\n1. Create Account");
            System.out.println("2. Create Post");
            System.out.println("3. Show Account Details");
            System.out.println("4. Show Feed");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");

            System.err.println("Choose Option from Above: ");
            option = 6;
            if (sc.hasNextInt()) {
                option = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear the invalid input from the scanner
            }
            switch (option) {
                case 1:
                    System.out.print("Enter username: ");
                    username = sc.next();
                    userId = users.size();
                    us = new User(username, userId);
                    users.add(us);
                    System.out.println("Account Created Successfully");
                    System.out.println(us);
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    userId = sc.nextInt();
                    sc.nextLine(); // To empty the buffer
                    System.out.println("Enter Post Text: ");
                    pText = sc.nextLine();
                    // Find the user
                    us = users.get(userId - 1);
                    // Add Post in the User
                    pst = us.addPost(pText);
                    // Add Post in the feed
                    feed.add(pst);
                    // Add the user back to the Users array
                    users.set(userId - 1, us);
                    System.out.println("Post Added !");
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    userId = sc.nextInt();
                    System.out.println(users.get(userId - 1));
                    break;
                case 4:
                    int counter = 1;
                    for (Post p : feed) {
                        System.out.println(counter + ": " + p.getPostText());
                        counter++;
                    }
                    break;
                case 5:
                    System.out.print("Enter User ID: ");
                    userId = sc.nextInt();
                    users.remove(userId - 1);
                    System.out.println("User Deleted");
                    break;
                case 6:
                    ans = 0;
                    break;
            }
        } while (ans == 1);
        sc.close();
    }
}
