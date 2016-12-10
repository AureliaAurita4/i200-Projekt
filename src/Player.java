import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by svetlana on 18.11.16.
 */

public class Player extends Application {

    public static void playFiles(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        String mp3 = "file:///home/svetlana/Documents/Java/Projects/i200_Project/src/01.MP3";
        Media media = new Media(mp3);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();

        MediaView mediaView = new MediaView(mediaPlayer);
        ((Group)scene.getRoot()).getChildren().add(mediaView);
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