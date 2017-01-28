import javafx.application.Application;
import javafx.stage.Stage;



/**
 * Created by svetlana on 8.10.16.
 */
public class i200_Project extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        Interface inter = new Interface();

        inter.openInterface(primaryStage);

    }

}