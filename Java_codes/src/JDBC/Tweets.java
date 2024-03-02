class Tweets {
    private int id, user_id;
    private String content;

    public Tweets() {
    }

    public Tweets(int id, int user_id, String content) {
        this.id = id;
        this.user_id = user_id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}