import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by svetlana on 10.12.16.
 */
public class Interface {

    private static String sex;
    private static String exerciseType;
    //public static ArrayList playList;

    public static void openInterface(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 200);

        primaryStage.setTitle("VOCEX - individual vocal exercises");
        primaryStage.setScene(scene);
        primaryStage.show();


        Label label1 = new Label("Please select your sex");
        ChoiceBox selection1 = new ChoiceBox(FXCollections.observableArrayList("Man", "Woman"));
        pane.getChildren().add(selection1);
        pane.getChildren().add(label1);
        label1.setLayoutX(80);
        selection1.setLayoutX(100);
        selection1.setLayoutY(20);


        Label label2 = new Label("What type of exercise do you want?");
        ChoiceBox selection2 = new ChoiceBox(FXCollections.observableArrayList("Warm up", "Breathing", "High notes"));
        pane.getChildren().add(selection2);
        pane.getChildren().add(label2);
        label2.setLayoutX(40);
        label2.setLayoutY(70);
        selection2.setLayoutX(90);
        selection2.setLayoutY(90);

        Button btn = new Button("Start singing!");
        btn.setLayoutX(95);
        btn.setLayoutY(150);
        pane.getChildren().add(btn);

        selection1.setOnAction(event -> {

            sex = (String)selection1.getValue();
            System.out.println(sex);

        });

        selection2.setOnAction(event -> {

            exerciseType = (String)selection2.getValue();
            System.out.println(exerciseType);
        });


        btn.setOnAction((event) -> {

            primaryStage.hide();
            Playlist.makePlaylist(sex, exerciseType);
            //ArrayToString.makeStringList(playList);
            //System.out.println(Playlist.playList);
            makeStringList(Playlist.playList);
        });




    }

    public static String makeStringList(ArrayList playList) {

        //System.out.println(playList);

        StringBuilder sb = new StringBuilder();
        for (Object s : playList) {
            sb.append(s);
            sb.append("\t");
        }

        String str = sb.toString();



        System.out.println(str.split("file:"));
        return str;
    }
}

//file:///home/svetlana/Documents/Java/Projects/i200_Project/src/04.MP3	file:///home/svetlana/Documents/Java/Projects/i200_Project/src/05.MP3	file:///home/svetlana/Documents/Java/Projects/i200_Project/src/06.MP3
