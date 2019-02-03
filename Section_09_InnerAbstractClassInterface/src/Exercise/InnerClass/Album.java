package Exercise.InnerClass;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if (this.songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public Song findSong(String title){
            for (Song checkedSong: this.songs){
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }
        public Song findSong(int trackNumber){
            int index = trackNumber-1;
            if (index >= 0 && index<songs.size()){
                return songs.get(index);
            }
            return null;
        }
    }

    public boolean addSong(String name, double duration){
        return this.songList.add(new Song(name, duration));
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playList){
        Song checkedSong = this.songList.findSong(trackNumber);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track" + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playList){
        Song checkedSong = this.songList.findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

}
