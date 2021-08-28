package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Start der Anwendung mit Erweiterung
 */
public class Main extends Application {

    /**
     *
     * @param primaryStage Primäre/r Screen/Anzeige - Laden der "Haupt-GUI"
     */
    @Override
    public void start(Stage primaryStage)
    {
        try {
            final FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Start.fxml"));
            final Parent root = (Parent) loader.load();
            Scene scene = new Scene(root);
            primaryStage.setTitle("Sharing Time");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param args Start der Methoden
     */
    public static void main(String[] args) {

        launch(args);
    }

}
