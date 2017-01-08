
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.util.ArrayList;


/**
 * Created by svetlana on 18.11.16.
 */

public class Player extends Application {

    private static MediaPlayer mediaPlayer;
    private static ToggleButton playButton = new ToggleButton("Play");
    private static ToggleButton pauseButton = new ToggleButton("Pause");
    private static ToggleButton stopButton = new ToggleButton("Stop");
    private static ToggleButton nextButton = new ToggleButton("Next");

    public static void playFiles(Stage primaryStage) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        HBox buttons = new HBox(playButton, pauseButton, stopButton, nextButton);

        Scene scene = new Scene(root, 300, 100);

        ArrayList<String> songList = new ArrayList();

        String fileName = "file:///home/svetlana/Documents/Java/Projects/i200_Project/src/";

        songList.add(fileName + "01.MP3"); //144215.0 ms
        songList.add(fileName + "02.MP3"); //132712.0 ms
        songList.add(fileName + "03.MP3"); //119409.0 ms
        songList.add(fileName + "04.MP3"); //131981.0 ms
        songList.add(fileName + "05.MP3"); //134146.0 ms
        songList.add(fileName + "06.MP3"); //91970.0 ms
        //System.out.println(songList.size());


        String mp3 = songList.get(0);
        Media media = new Media(mp3);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        playButton.setSelected(true);





        root.getChildren().addAll(buttons);
        primaryStage.setTitle("Media Player");
        primaryStage.setScene(scene);
        root.setStyle("-fx-background-color: ANTIQUEWHITE");

        playButton.setOnAction(e -> {
            play();
        });

        pauseButton.setOnAction(e -> {
            pause();
        });

        stopButton.setOnAction(e -> {
            stopp();
        });

//        nextButton.setOnAction(e -> {

        //        for (int i = 0; i < songList.size(); i++) {
//            if (mediaPlayer.getCycleDuration() < ) {
//                 mp3 = songList.get(1);
//                 media = new Media(mp3);
//                 mediaPlayer.play();
//                 playButton.setSelected(true);
//            }
//
//        }
//
//        });

        primaryStage.show();
    }


    private static void pause() {
        mediaPlayer.pause();
        pauseButton.setSelected(true);
    }

    private static void play() {
        mediaPlayer.play();
        playButton.setSelected(true);
    }

    private static void stopp() {
        mediaPlayer.stop();
        stopButton.setSelected(true);
    }

//    private static void playNext() {
//        System.out.println(mediaPlayer.getCycleDuration());
//        nextButton.setSelected(true);
//    }

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        playFiles(primaryStage);
    }

}