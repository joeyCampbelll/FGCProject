import java.io.File;
import java.net.URL;

import Controllers.HomeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppController 
{
	private FXMLLoader loader;
	private Stage stage;

	public AppController(Stage stage, FXMLLoader loader)
	{
		this.loader = loader;
		this.stage = stage;
	}
	
	public void buildHome() throws Exception
	{
		HomeController homeController = new HomeController(this.stage);
		this.loader.setController(homeController);

		File fxmlFile = new File("Views\\HomeView.fxml");
		URL fxmlUrl = fxmlFile.toURI().toURL();
		loader.setLocation(fxmlUrl);

		// Scene homeScene = new Scene(homeController.getBorderPaneHome());
		BorderPane bPane = loader.<BorderPane>load();
		Scene homeScene = new Scene(bPane);

		this.stage.setScene(homeScene);
		this.stage.show();
	}
}
