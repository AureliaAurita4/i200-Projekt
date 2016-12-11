
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


/**
 * Created by svetlana on 18.11.16.
 */

public class Player extends Application {

    private static MediaPlayer mediaPlayer;
    private static ToggleButton playButton = new ToggleButton("Play");
    private static ToggleButton pauseButton = new ToggleButton("Pause");
    private static ToggleButton stopButton = new ToggleButton("Stop");

    public static void playFiles(Stage primaryStage) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        HBox buttons = new HBox(playButton, pauseButton, stopButton);

        Scene scene = new Scene(root, 300, 100);

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

    private static void pause() {
        mediaPlayer.pause();
        pauseButton.setSelected(true);
    }

    private static void play() {
        mediaPlayer.play();
        playButton.setSelected(true);
    }

    public static void stopp() {
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