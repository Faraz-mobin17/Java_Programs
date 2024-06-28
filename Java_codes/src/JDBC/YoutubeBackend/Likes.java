
class Likes {
    private int id, user_id, video_id;

    public Likes() {
        System.out.println("Likes constructor invoked");
    }

    public Likes(int id, int user_id, int video_id) {
        this.id = id;
        this.user_id = user_id;
        this.video_id = video_id;
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

}