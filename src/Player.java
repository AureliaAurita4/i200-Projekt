
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.util.ArrayList;


/**
 * Created by svetlana on 18.11.16.
 */

public class Player {

    private static MediaPlayer player;
    //private static MediaView mediaView = new MediaView();
    private static ToggleButton playButton = new ToggleButton("Play");
    private static ToggleButton pauseButton = new ToggleButton("Pause");
    private static ToggleButton stopButton = new ToggleButton("Stop");
    private static ToggleButton nextButton = new ToggleButton("Next");

    public static void playFiles(Stage primaryStage, ArrayList songList) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        HBox buttons = new HBox(playButton, pauseButton, stopButton, nextButton);

        Scene scene = new Scene(root, 300, 100);

//        for(int i = 0; i < songList.size(); i++){
//            String mp3 = (String)songList.get(i);
//            Media media = new Media(mp3);
//            songList.add(new MediaPlayer(media));
//        }
//
//        MediaPlayer player = (MediaPlayer)songList.get(0);
//        mediaView.setMediaPlayer(player);
//        player.play();

        String mp3 = (String)songList.get(0);
        Media media = new Media(mp3);
        player = new MediaPlayer(media);
        player.play();
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

        nextButton.setOnAction(e -> {

           // playNext();

        });

        primaryStage.show();
    }


    private static void pause() {
        player.pause();
        pauseButton.setSelected(true);
    }

    private static void play() {
        player.play();
        playButton.setSelected(true);
    }

    private static void stopp() {
        player.stop();
        stopButton.setSelected(true);
    }

//    private static void playNext() {
//        MediaPlayer currentSong = mediaView.getMediaPlayer();
//        MediaPlayer nextSong = songList.get((songList.indexOf(currentSong) + 1) % songList.size());
//        mediaView.setMediaPlayer(nextSong);
//
//        currentSong.stop();
//        nextSong.play();
//    }

}