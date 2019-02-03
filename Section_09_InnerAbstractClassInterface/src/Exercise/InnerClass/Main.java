package Exercise.InnerClass;

import java.util.*;

public class Main {

    private static List<Album> myAlbums = new ArrayList<>();

    public static void main(String[] args) {


        Album album_01 = new Album("Album_01", "Artist_01");
        album_01.addSong("Album_01_Song_01", 1.33);
        album_01.addSong("Album_01_Song_02", 2.32);
        album_01.addSong("Album_01_Song_03", 2.43);
        album_01.addSong("Album_01_Song_04", 1.35);
        album_01.addSong("Album_01_Song_05", 2.75);
        album_01.addSong("Album_01_Song_06", 6.45);
        album_01.addSong("Album_01_Song_07", 7.75);
        myAlbums.add(album_01);

        Album album_02 = new Album("Album_02", "Artist_02");
        album_02.addSong("Album_02_Song_01", 3.33);
        album_02.addSong("Album_02_Song_02", 2.38);
        album_02.addSong("Album_02_Song_03", 4.43);
        album_02.addSong("Album_02_Song_04", 2.75);
        myAlbums.add(album_02);


        List<Song> playList = new ArrayList<>();
        myAlbums.get(0).addToPlaylist("Album_01_Song_04", playList);
        myAlbums.get(0).addToPlaylist("Album_01_Song_02", playList);
        myAlbums.get(0).addToPlaylist("Album_01_Song_22", playList);  // Does not exist
        myAlbums.get(0).addToPlaylist(7, playList);
        myAlbums.get(1).addToPlaylist(2, playList);
        myAlbums.get(1).addToPlaylist("Album_02_Song_01", playList);
        myAlbums.get(1).addToPlaylist(4, playList);
        myAlbums.get(1).addToPlaylist("Album_02_Song_99", playList);
        System.out.println(playList);

        play(playList);


    }

    private static void play(List<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();

        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list ");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the list ");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Instructions");
        System.out.println("0 - quit");
        System.out.println("1 - skip to next song");
        System.out.println("2 - skip to previous song");
        System.out.println("3 - replay current song");
        System.out.println("4 - list songs in playlist");
        System.out.println("5 - print available actions");
        System.out.println("6 - delete current song from playlist");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
    }



}

