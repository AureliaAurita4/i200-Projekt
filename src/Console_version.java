import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.*;
import java.io.FileInputStream;

/**
 * Created by svetlana on 18.11.16.
 */
public class Console_version {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your sex?");
        String sex = input.nextLine();

        if (sex.equals("man")) {
            System.out.println("What is your voice type: tenor, baritone, or bass?");
            String voiceType = input.nextLine();
        } else if (sex.equals("woman")) {
            System.out.println("What is your voice type: soprano, mezzo-soprano, or contralto?");
            String voiceType = input.nextLine();
        } else {
            throw new RuntimeException("Please, choose your sex!");
        }


        //copied from: http://stackoverflow.com/questions/11922152/jfilechooser-to-open-multiple-txt-files
        System.out.println("What would you like to do: warm-up, breathing exercise, or work out the high notes?");
        String exercise = input.nextLine();

        File [] playlistFile = null;
        ArrayList<File> playlist = new ArrayList<File>();



    }
}

//public class SimplePlayer {
//
//    public SimplePlayer(){
//
//        try{
//
//            FileInputStream fis = new FileInputStream("File location.");
//            Player playMP3 = new Player(fis);
//
//            playMP3.play();
//
//        }catch(Exception e){System.out.println(e);}
//    }
//
//}
