
class Playlists {
    private int id, user_id, video_id;
    private String name, description;

    public Playlists() {
        System.out.println("playlist constructor invoked");
    }

    public Playlists(int id, int user_id, int video_id, String name, String description) {
        this.id = id;
        this.user_id = user_id;
        this.video_id = video_id;
        this.name = name;
        this.description = description;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}