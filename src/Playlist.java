import java.util.ArrayList;

/**
 * Created by svetlana on 10.12.16.
 */
public class Playlist {

    public static String sex;
    public static String exerciseType;

    static ArrayList playList;

    public static ArrayList makePlaylist() {

        if (sex.equals("Woman") && exerciseType.equals("Warm up")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/01.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/02.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/03.MP3");

        } else if (sex.equals("Man") && exerciseType.equals("Warm up")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/04.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/05.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/06.MP3");
        }

        else if (sex.equals("Woman") && exerciseType.equals("Breathing")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/04.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/05.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/06.MP3");
        }

        else if (sex.equals("Man") && exerciseType.equals("Breathing")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/04.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/05.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/06.MP3");
        }

        else if (sex.equals("Woman") && exerciseType.equals("High notes")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/04.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/05.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/06.MP3");
        }

        else if (sex.equals("Man") && exerciseType.equals("High notes")) {
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/04.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/05.MP3");
            playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/06.MP3");
        }

        return playList;
    }
}
