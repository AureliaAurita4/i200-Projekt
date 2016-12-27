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

    public static void main(String[] args) {
        String string = "004-034556";
        String[] parts = string.split("-");
        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556
        System.out.println(part1);
        System.out.println(part2);
    }
}