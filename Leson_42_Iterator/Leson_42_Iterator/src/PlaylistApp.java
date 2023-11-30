
public class PlaylistApp {

        public static void main(String[] args) {
            String [] songs = new String[5];
            songs[0] = new String("Track 1");
            songs[1] = new String("Track 2");
            songs[2] = new String("Track 3");
            songs[3] = new String("Track 4");
            songs[4] = new String("Track 5");

            Playlist playlist = new Playlist(songs);

            for (String song : playlist) {
                System.out.println(song);
            }
        }

}
