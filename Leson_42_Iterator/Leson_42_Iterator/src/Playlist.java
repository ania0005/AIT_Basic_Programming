import java.util.Iterator;


    // Создайте класс Playlist, который реализует Iterable и содержит список песен. Реализовать итератор,
    // который позволяет переключаться между песнями.

   public class Playlist implements Iterable<String> {

    private String [] songs;

       public Playlist(String[ ]songs) {
        this.songs = songs;
    }


    @Override
    public Iterator<String> iterator() {
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements Iterator<String> {
        private int currentIndex = 0;
        String currentSong;

        @Override
        public boolean hasNext() {
            return currentIndex < songs.length;
        }

        @Override
        public String next() {
            if (hasNext()) {
                currentSong = songs[currentIndex];
                currentIndex++;
                return currentSong;
            }
            return null;
        }
    }
}

