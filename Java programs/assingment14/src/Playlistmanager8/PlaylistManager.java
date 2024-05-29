package Playlistmanager8;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class PlaylistManager {
    LinkedList <Song> songs=new LinkedList<Song>();
    Scanner scanner=new Scanner(System.in);

    public void addSong(int songId, String title, String artist, String album, int duration) {
        Song newSong = new Song(songId, title, artist, album, duration);
        songs.add(newSong);
        System.out.println("Song '" + title + "' added to the playlist.");
    }

    public void removeSong(int songId) {
//        boolean removed = songs.removeIf(song -> song.getSongId() == songId);
//        if (removed) {
//            System.out.println("Song with ID " + songId + " removed from the playlist.");
//        } else {
//            System.out.println("Song with ID " + songId + " not found in the playlist.");
//        }
       try {
           for (Song s:songs){
               if(s.getSongId()==songId){
                   songs.remove(s);
               }
           }
       }catch (Exception e){
           System.out.println(e);
       }


    }

    public void searchSongByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Song found:");
                System.out.println(song);
                return;
            }
        }
        System.out.println("No song found with title '" + title + "'.");
    }

    public void displayAllSongsSortedByDuration() {
        LinkedList<Song> sortedSongs = new LinkedList<>(songs);
        Collections .sort(sortedSongs,new Comparatorduration());
        System.out.println("Songs sorted by duration:");
        for (Song song : sortedSongs) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        PlaylistManager playlistManager=new PlaylistManager();
        playlistManager.addSong(1,"Fanna","arjit","naam",4);
        playlistManager.addSong(2,"tereNam","ujwal","pagal",5);
        playlistManager.addSong(3,"stay","Kidlorai","Stay",3);
        System.out.println(playlistManager.songs);
        playlistManager.removeSong(1);
        System.out.println(playlistManager.songs);
    }
}
