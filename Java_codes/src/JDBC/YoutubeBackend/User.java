import java.sql.SQLException;

class User {
    private DatabaseUtils db = new DatabaseUtils();
    boolean isLoggedIn;
    private int id, user_id;
    private String username, email, fullname, avatar, coverImage,
            password;

    public User(int id, int user_id, String username, String email,
            String fullname, String avatar, String coverImage, String password) {
        this.id = id;
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.fullname = fullname;
        this.avatar = avatar;
        this.coverImage = coverImage;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getDetails() {
        return "User [username=" + username + ", email=" + email + ", fullname=" + fullname + ", avatar=" + avatar
                + ", coverImage=" + coverImage + "]";
    }

    public void registerUser() {
        String userExists = "SELECT username, email FROM Users WHERE username = ? OR email = ?";
        try {
            if (db.searchRecord(userExists, username, email)) {
                System.out.println("Users Exists");
                System.out.println("Login");
                loginUser(username, password);
            } else {
                String query = "INSERT INTO Users (username, email,fullname,avatar,coverImage,password) VALUES (?, ?,?,?,?,?)";
                try {
                    db.insertRecord(query, username, email, fullname, avatar, coverImage, password);
                } catch (SQLException e) {
                    e.printStackTrace();
                    return;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loginUser(String username, String password) {
        String query = "SELECT username FROM Users WHERE username = ? AND password = ?";
        try {
            if (db.searchRecord(query, username, password)) {
                System.out.println(username + " logged In");
                isLoggedIn = true;
            } else {
                System.out.println("User not logged In");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser() {
        // if user doesn't exists return msg user doesn't exists
        if (isLoggedIn) {
            String query = "DELETE FROM Users WHERE id = ?";
            try {
                db.deleteRecord(query, id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("User doesn't exists");
        }
    }
}
