import java.io.File;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FGCController {
	private Stage primaryStage;
	private String excelPath; 

	public FGCController(Stage stage) {
		this.primaryStage = stage;
	}
	@FXML
	public void openFileClicked(Event e) {
		FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(primaryStage);
		excelPath = file.toPath().toString();
		System.out.println(excelPath);

	}
}
