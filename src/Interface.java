import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by svetlana on 10.12.16.
 */
public class Interface {

    public static String sex;
    public static String exerciseType;

    public static void openInterface(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 200);

        primaryStage.setTitle("VOCEX - individual vocal exercises");
        primaryStage.setScene(scene);
        primaryStage.show();


        //add label that says "Please select your sex"
        ChoiceBox selection1 = new ChoiceBox(FXCollections.observableArrayList("Man", "Woman"));
        pane.getChildren().add(selection1);
        selection1.setLayoutX(100);


        //add label that says "What type of exercise do you want?"
        ChoiceBox selection2 = new ChoiceBox(FXCollections.observableArrayList("Warm up", "Breathing", "High notes"));
        pane.getChildren().add(selection2);
        selection2.setLayoutX(90);
        selection2.setLayoutY(50);

        Button btn = new Button("Start singing!");
        btn.setLayoutX(90);
        btn.setLayoutY(100);
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
            Playlist.makePlaylist();
            System.out.println(Playlist.playList);



        });


    }
}
