// jfx imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// java lib imports
import java.io.File;
import java.net.URL;

public class FGCApp extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        FGCController controller = new FGCController(primaryStage);
		loader.setController(controller);

        File fxmlFile = new File("FGCApp.fxml");
        URL fxmlUrl = fxmlFile.toURI().toURL();
        loader.setLocation(fxmlUrl);
		
        BorderPane bPane = loader.<BorderPane>load();
        FGCController controllerRef = loader.getController();


        Scene scene = new Scene(bPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
