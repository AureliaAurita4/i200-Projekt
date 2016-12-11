import java.util.ArrayList;

/**
 * Created by svetlana on 11.12.16.
 */
public class ArrayToString {

    public static void main(String[] args) {

        ArrayList<String> playList = new ArrayList<>();

        playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/01.MP3");
        playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/02.MP3");
        playList.add("file:///home/svetlana/Documents/Java/Projects/i200_Project/src/03.MP3");

        StringBuilder sb = new StringBuilder();
        for (String s : playList)
        {
            sb.append(s);
            sb.append("\t");
        }

        System.out.println(sb.toString());
    }
}
