import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/* DO NOT TRY TO RUN THIS FILE, RUN RunMe
Current version made by: Max on 10/4/2025
This runs the Version of the code I made to work with JavaFX. Unfortunately,
this causes an error if you try to run it by itself, thus you need to run
RunMe.
"Error: JavaFX runtime components are missing, and are required to run this application"
 */

public class Max_Main_view_test extends Application {

    @Override public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new TestTournamentController().getView(), 425, 600);
        stage.setScene(scene);
        stage.setTitle("Tournament Runner 5000");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}