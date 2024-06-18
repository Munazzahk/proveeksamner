package Songs;

public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.duration = duration;
        this.artist = artist;
        this.title = title;
    }
    public int getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

}
