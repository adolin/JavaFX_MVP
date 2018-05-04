import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo extends Application {

    @Override
    public void start (Stage primaryStage) throws Exception {
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("view/login.fxml"));
        Parent root = loginLoader.load();
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main (String[] args) {
        launch(args);
    }
}
