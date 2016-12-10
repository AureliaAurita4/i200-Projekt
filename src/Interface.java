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

    public static void openInterface(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setTitle("VOCEX - individual vocal exercises");
        primaryStage.setScene(scene);
        primaryStage.show();


        ChoiceBox selection1 = new ChoiceBox(FXCollections.observableArrayList("Man", "Woman"));
        pane.getChildren().add(selection1);
        selection1.setLayoutX(100);


//        ChoiceBox selection2 = new ChoiceBox(FXCollections.observableArrayList());
//        pane.getChildren().add(selection2);
//        selection2.setLayoutX(100);
//        selection2.setLayoutY(50);

        ChoiceBox selection3 = new ChoiceBox(FXCollections.observableArrayList("Warm up", "Breathing", "High notes"));
        pane.getChildren().add(selection3);
        selection3.setLayoutX(90);
        selection3.setLayoutY(100);

        Button btn = new Button("OK");
        btn.setLayoutX(125);
        btn.setLayoutY(150);
        pane.getChildren().add(btn);

        selection1.setOnAction(event -> {
            System.out.println(selection1.getValue());
//
//            if (selection1.getValue().equals("Man")) {
//                selection2.getItems().add("Tenor");
//                selection2.getItems().add("Baritone");
//                selection2.getItems().add("Bass");
//
//            } else if (selection1.getValue().equals("Woman")) {
//                selection2.getItems().add("Soprano");
//                selection2.getItems().add("Mezzo-soprano");
//                selection2.getItems().add("Contralto");
//            }
        });
//
//        selection2.setOnAction(event -> {
//            System.out.println(selection2.getValue());
//        });

        selection3.setOnAction(event -> {
            System.out.println(selection3.getValue());
        });


        btn.setOnAction((event) -> {

            primaryStage.hide();

        });
    }
}
