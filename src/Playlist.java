import java.util.ArrayList;

/**
 * Created by svetlana on 10.12.16.
 */
public class Playlist {


    public static ArrayList<String> makePlaylist(String sex, String exerciseType) {
        ArrayList<String> playList = new ArrayList();
        String fileName = "file:///home/svetlana/Documents/Java/Projects/i200_Project/src/";
        if (sex.equals("Woman") && exerciseType.equals("Warm up")) {
            playList.add(fileName + "01.MP3");
            playList.add(fileName + "02.MP3");
            playList.add(fileName + "03.MP3");

        } else if (sex.equals("Man") && exerciseType.equals("Warm up")) {
            playList.add(fileName + "01.MP3");
            playList.add(fileName + "02.MP3");
            playList.add(fileName + "03.MP3");
        }

        else if (sex.equals("Woman") && exerciseType.equals("Breathing")) {
            playList.add(fileName + "04.MP3");
            playList.add(fileName + "05.MP3");
            playList.add(fileName + "06.MP3");
        }

        else if (sex.equals("Man") && exerciseType.equals("Breathing")) {
            playList.add(fileName + "04.MP3");
            playList.add(fileName + "05.MP3");
            playList.add(fileName + "06.MP3");
        }

        else if (sex.equals("Woman") && exerciseType.equals("High notes")) {
            playList.add(fileName + "04.MP3");
            playList.add(fileName + "05.MP3");
            playList.add(fileName + "06.MP3");
        }

        else if (sex.equals("Man") && exerciseType.equals("High notes")) {
            playList.add(fileName + "04.MP3");
            playList.add(fileName + "05.MP3");
            playList.add(fileName + "06.MP3");
        }


        return playList;
    }


}
