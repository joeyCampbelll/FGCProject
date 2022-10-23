package Controllers;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class FGCController {
	private Stage primaryStage;

	// FXML
	@FXML
	private Button buttonSpreadsheetProperties;
	@FXML
	private Button buttonApplyFilter;
	@FXML
	private Button buttonFilterHistory;
	@FXML
	private Button buttonSaveFilter;

	@FXML
	private TextArea textAreaLeft;
	@FXML
	private TextArea textAreaRight;

	public FGCController(Stage stage) {
		this.primaryStage = stage;
	}
	
	@FXML
	public void spreadsheetPropertiesClicked(Event e) {
		System.out.println("Stub for spreadsheet properties...");
	}

	@FXML
	public void applyFilterClicked(Event e) {
		System.out.println("Stub for apply filter...");
	}

	@FXML
	public void filterHistoryClicked(Event e) {
		System.out.println("Stub for filter history...");
	}

	@FXML
	public void saveFilterClicked(Event e) {
		System.out.println("Stub for save filter...");
	}
}
