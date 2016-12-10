import java.util.ArrayList;

/**
 * Created by svetlana on 10.12.16.
 */
public class Playlist {

    static ArrayList playList;

    public static ArrayList makePlayList(){

        if (selection1.equals("Woman") && selection3.equals("Warm up")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/01.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/02.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/03.MP3");

        } else if (selection1.equals("Man") && selection3.equals("Warm up")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/04.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/05.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/06.MP3");
        }

        return playList;
    }

}
