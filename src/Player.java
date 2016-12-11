import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by svetlana on 18.11.16.
 */

public class Player extends Application {

    private MediaPlayer mediaPlayer;
    private final ToggleButton playButton = new ToggleButton("Play");
    private final ToggleButton pauseButton = new ToggleButton("Pause");
    private final ToggleButton stopButton = new ToggleButton("Stop");
    private final ToggleGroup group = new ToggleGroup();
    private final Label totalDuration = new Label();
    private final Label currentDuration = new Label();
    private final Slider timeSlider = new Slider();


    public void playFiles(Stage primaryStage) {

        VBox root = new VBox(10);
        Scene scene = new Scene(root, 300, 100);

        root.setAlignment(Pos.CENTER);
        HBox playPauseStop = new HBox(playButton, pauseButton, stopButton);
        HBox sliderBox = new HBox(timeSlider, currentDuration, totalDuration);

        HBox.setHgrow(sliderBox, Priority.ALWAYS);

        String mp3 = "file:///home/svetlana/Documents/Java/Projects/i200_Project/src/01.MP3";
        Media media = new Media(mp3);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();

        root.getChildren().addAll(sliderBox, playPauseStop);
        primaryStage.setTitle("Media Player");
        primaryStage.setScene(scene);
        scene.setFill(Color.DARKSALMON);

//        ToggleButton playBack = new ToggleButton("play_pause_stop");
//        ToggleGroup btnGroup = new ToggleGroup();
//        ToggleButton play = new ToggleButton("Play")

        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        playFiles(primaryStage);
    }

}