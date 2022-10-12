import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FGCController {
	private Stage primaryStage;

	// FXML
	@FXML
	private Button buttonOpenFile;

	public FGCController(Stage stage) {
		this.primaryStage = stage;
	}
	
	@FXML
	public void openFileClicked(Event e) {

	}
}
