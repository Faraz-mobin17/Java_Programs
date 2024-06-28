
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class YoutubeBackend {
    private String connectionString;
    private String username, password;

    public YoutubeBackend(String con, String username, String password) {
        connectionString = con;
        this.username = username;
        this.password = password;
    }

    public void insertRecord(String query, Object... parameters) {
        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Set parameters in the prepared statement
                for (int i = 0; i < parameters.length; i++) {
                    preparedStatement.setObject(i + 1, parameters[i]);
                }

                // Execute the update
                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " record(s) inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createUser(String query, Object... parameters) {
        insertRecord(query, parameters);
    }

    public void uploadVideo(String query, Object... parameters) {
        insertRecord(query, parameters);
    }

    public void createTweet(String query, Object... parameters) {
        insertRecord(query, parameters);
    }

    public void addComment(String query, Object... parameters) {
        insertRecord(query, parameters);
    }

    public void createPlayList(String query, Object... parameters) {
        insertRecord(query, parameters);
    }

    public static void main(String[] args) {
        // Ask the user which table they want to insert the data into, using switch case
        // statements.
        // Before proceeding, check if the specified table provided by the user exists.
        // If the table exists, insert the data into that table; otherwise, throw an
        // exception.

        // Create a custom data structure that encapsulates database connection details,
        // including
        // the connection string, username, and password. Also, include the query to be
        // executed.

        // Prompt the user to choose the operation they want to perform - insert,
        // update, or delete.
        // Based on the user's choice, form the corresponding SQL query accordingly.
        Scanner sc = new Scanner(System.in);
        String connectionString = "jdbc:mysql://localhost:3306/youtube";
        String username = "root";
        String password = "toor";
        YoutubeBackend connector = new YoutubeBackend(connectionString, username, password);

        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Login User"); // TODO: pending
            System.out.println("3. Upload Video");
            // System.out.println("Watch history left");
            // System.out.println("subscription left");
            // System.out.println("likes left");
            System.out.println("4. Create Tweet");
            System.out.println("5. Add Comment");
            System.out.println("6. Create PlayLists");
            System.out.println("7. EXIT");
            int choice = sc.nextInt();
            String query;
            switch (choice) {
                case 1:
                    query = "INSERT INTO Users (username, email,fullname,avatar,coverImage,password) VALUES (?, ?,?,?,?,?)";
                    String uname = sc.nextLine();
                    String email = sc.nextLine();
                    String fullname = sc.nextLine();
                    String avatar = sc.nextLine();
                    String coverImage = sc.nextLine();
                    String pwd = sc.nextLine();
                    connector.createUser(query, uname, email, fullname, avatar, coverImage, pwd);
                    break;
                case 2:
                    query = "INSERT INTO Videos (user_id,videoFile, thumbnail, title, description, duration, views, isPublished) VALUES (?,?, ?, ?, ?, ?, ?, ?)";
                    int userId = sc.nextInt();
                    sc.nextLine();
                    String videoUrl = sc.nextLine();
                    String thumbnailUrl = sc.nextLine();
                    String title = sc.nextLine();
                    String description = sc.nextLine();
                    int duration = sc.nextInt();
                    int views = sc.nextInt();
                    boolean isPublished = sc.nextBoolean();
                    connector.uploadVideo(query, userId, videoUrl, thumbnailUrl, title, description, duration, views,
                            isPublished);
                    break;
                case 3:
                    query = "INSERT INTO Tweets (user_id, content) VALUES (?, ?)";
                    int TweetUserId = sc.nextInt();
                    sc.nextLine();
                    String content = sc.nextLine();
                    connector.createTweet(query, TweetUserId, content);
                    break;
                case 4:
                    query = "INSERT INTO Comments ( user_id, video_id, content) VALUES (?,?, ?)";
                    int commnetUserId = sc.nextInt();
                    sc.nextLine();
                    int videoId = sc.nextInt();
                    sc.nextLine();
                    String commentContent = sc.nextLine();
                    connector.addComment(query, commnetUserId, videoId, commentContent);
                    break;
                case 5:
                    query = "INSERT INTO Playlists (user_id, video_id, name, description) VALUES (?,?, ?, ?)";
                    int playlistId = sc.nextInt();
                    sc.nextLine();
                    int playlistVideoId = sc.nextInt();
                    sc.nextLine();
                    String playlistDescription = sc.nextLine();
                    connector.createPlayList(query, playlistId, playlistVideoId, playlistDescription);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Bad Choice");
                    break;
            }
        }
    }
}
