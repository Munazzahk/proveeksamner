package Songs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> playlist = new ArrayList<>();
    File file = new File("src/Playlist.csv");

    public void addSong(Song song) {
        playlist.add(song);
    }

    public int getTotalDuration() {
        int totalDuration = 0;

        for (Song song : playlist) {
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }

    public void save() {

        try {
            PrintStream ps = new PrintStream(file);

            for (Song song : playlist) {
                ps.println(song.getTitle() + "," + song.getArtist() + "," + song.getDuration());
            }
        } catch (IOException e) {
            System.out.println("An error occured while saving: " + e.getMessage());
        }
    }
}
