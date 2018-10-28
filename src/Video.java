public class Video {
    public int id;
    public String name;

    public Video(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id of video: "
                + this.id
                + ", video's name: "
                + this.name;
    }
}
