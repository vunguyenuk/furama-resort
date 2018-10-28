public class Music {
    public String nameMusic;

    public Music(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    @Override
    public String toString() {
        return "Name of music: " + this.nameMusic;
    }
}
