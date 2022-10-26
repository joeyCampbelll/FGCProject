// jfx imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


public class FGCApp extends Application{
	
	public static void main(String[] args) {
		launch(args);
    }
	

    @Override
    public void start(Stage primaryStage) throws Exception {
		// FXMLLoader loader = new FXMLLoader();

		// FGCController controller = new FGCController(primaryStage);
		// loader.setController(controller);

		// File fxmlFile = new File("FGCApp.fxml");
		// URL fxmlUrl = fxmlFile.toURI().toURL();
		// loader.setLocation(fxmlUrl);
		
		// BorderPane bPane = loader.<BorderPane>load();

		// Scene scene = new Scene(bPane);
		// primaryStage.setScene(scene);
		// primaryStage.show();


		FXMLLoader loader = new FXMLLoader();
		AppController appController = new AppController(primaryStage, loader);

		appController.buildHome();
    }
}