class WatchHistory {
    private int id, user_id, video_id;
    private String watched_at;

    public WatchHistory() {}

    public WatchHistory(int id, int user_id, int video_id, String watched_at) {
        this.id = id;
        this.user_id = user_id;
        this.video_id = video_id;
        this.watched_at = watched_at;
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

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public String getWatched_at() {
        return watched_at;
    }

    public void setWatched_at(String watched_at) {
        this.watched_at = watched_at;
    }

    
}
