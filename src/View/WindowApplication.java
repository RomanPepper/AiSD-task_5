package View;

import Presenter.Presenter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class WindowApplication extends Application {
    private Presenter presenter;
    public void launchFrame() {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Bebra-IT: Task #5.12");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/FXML/main.fxml"));
        loader.setController(presenter);

        Parent root = loader.load();

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/View/CSS/styles.css").toExternalForm());
        stage.setScene(scene);

        stage.show();
    }
}



