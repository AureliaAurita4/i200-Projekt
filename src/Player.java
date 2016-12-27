
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

    private MediaPlayer mediaPlayer;
    private ToggleButton playButton = new ToggleButton("Play");
    private ToggleButton pauseButton = new ToggleButton("Pause");
    private ToggleButton stopButton = new ToggleButton("Stop");

    public String str;

    public void playFiles(Stage primaryStage) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        HBox buttons = new HBox(playButton, pauseButton, stopButton);

        Scene scene = new Scene(root, 300, 100);

        //makeStringList();

        //singleFile();

        String mp3 = "file:///home/svetlana/Documents/Java/Projects/i200_Project/src/01.MP3";
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

        primaryStage.show();
    }

    private String singleFile(String str) {



        return null;
    }

    private void pause() {
        mediaPlayer.pause();
        pauseButton.setSelected(true);
    }

    private void play() {
        mediaPlayer.play();
        playButton.setSelected(true);
    }

    private void stopp() {
        mediaPlayer.stop();
        stopButton.setSelected(true);
    }

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        playFiles(primaryStage);
    }

}