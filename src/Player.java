
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
    private static Media media;
    private static ArrayList<MediaPlayer> fileList;
    private static MediaView mediaView = new MediaView();
    private static ToggleButton playButton = new ToggleButton("Play");
    private static ToggleButton pauseButton = new ToggleButton("Pause");
    private static ToggleButton stopButton = new ToggleButton("Stop");
    private static ToggleButton nextButton = new ToggleButton("Next");

    public void playFiles(Stage primaryStage, ArrayList<String> songList) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        HBox buttons = new HBox(playButton, pauseButton, stopButton, nextButton);
        Scene scene = new Scene(root, 300, 100);
        fileList = new ArrayList();

        for(int i = 0; i < songList.size(); i++){
            String mp3 = songList.get(i).toString();
            media = new Media(mp3);
            fileList.add(new MediaPlayer(media));
    }

        player = fileList.get(0);
        mediaView.setMediaPlayer(player);
        player.play();

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

            playNext();

        });

        primaryStage.show();
    }


    private static void pause() {
        player.pause();
        pauseButton.setSelected(false);
    }

    private static void play() {
        player.play();
        playButton.setSelected(false);
    }

    private static void stopp() {
        player.stop();
        stopButton.setSelected(false);
    }

    private static void playNext() {
        MediaPlayer currentSong = mediaView.getMediaPlayer();
        MediaPlayer nextSong = fileList.get((fileList.indexOf(currentSong) + 1) % fileList.size());//loop back the list
        mediaView.setMediaPlayer(nextSong);

        currentSong.stop();
        player = nextSong;
        player.play();
    }

}