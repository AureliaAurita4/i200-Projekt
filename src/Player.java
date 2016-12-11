
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


/**
 * Created by svetlana on 18.11.16.
 */

public class Player extends Application {

    private MediaPlayer mediaPlayer;
    private final ToggleButton playButton = new ToggleButton("Play");
    private final ToggleButton pauseButton = new ToggleButton("Pause");
    private final ToggleButton stopButton = new ToggleButton("Stop");
    private final SliderBar progressSlider = new SliderBar();


    public void playFiles(Stage primaryStage) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        HBox buttons = new HBox(playButton, pauseButton, stopButton);
        HBox sliderBox = new HBox(progressSlider);
        HBox.setHgrow(sliderBox, Priority.ALWAYS);

        Scene scene = new Scene(root, 300, 100);

        String mp3 = "file:///home/svetlana/Documents/Java/Projects/i200_Project/src/01.MP3";
        Media media = new Media(mp3);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        playButton.setSelected(true);

        root.getChildren().addAll(sliderBox, buttons);
        primaryStage.setTitle("Media Player");
        primaryStage.setScene(scene);
        root.setStyle("-fx-background-color: ANTIQUEWHITE");

        playButton.setOnAction(e -> {
            play();
        });

        pauseButton.setOnAction(e -> {
            pause();
        });

        pauseButton.setOnAction(e -> {
            stop();
        });

        primaryStage.show();
    }

    private void pause() {
        mediaPlayer.pause();
        playButton.setSelected(true);
    }

    private void play() {
        mediaPlayer.play();
        playButton.setSelected(true);
    }

    public void stop() {
        mediaPlayer.stop();
        playButton.setSelected(true);
    }

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        playFiles(primaryStage);
    }

}