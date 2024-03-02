class User {
    private int id;
    private String username, email, fullname, avatar, coverImage, password;

    public User() {
        System.out.println("Default constructor invoked");
    }

    public User(int id, String username, String email, String fullname, String avatar, String coverImage,
            String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.fullname = fullname;
        this.avatar = avatar;
        this.coverImage = coverImage;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
