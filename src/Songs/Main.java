package Songs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Playlist newPlaylist = new Playlist();
        Song song1 = new Song("Hello", "Anna", 200);
        Song song2 = new Song("No", "Lars", 300);
        Song song3 = new Song("NotDone", "Lara", 100);
        Song song4 = new Song("Yes", "Peter", 800);

        newPlaylist.addSong(song1);
        newPlaylist.addSong(song2);
        newPlaylist.addSong(song3);
        newPlaylist.addSong(song4);

        System.out.println(newPlaylist.getTotalDuration());
        newPlaylist.save();


    }
}
