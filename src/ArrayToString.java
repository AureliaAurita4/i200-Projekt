import java.util.ArrayList;

/**
 * Created by svetlana on 11.12.16.
 */
public class ArrayToString {

    public static ArrayList playList;

    public static String makeStringList(ArrayList playList) {

        System.out.println(playList);

        StringBuilder sb = new StringBuilder();
        for (Object s : playList) {
            sb.append(s);
            sb.append("\t");
        }

        String str = sb.toString();

        return str;
    }
}