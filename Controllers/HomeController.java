package Controllers;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HomeController {
	private Stage primaryStage;

	// FXML
	@FXML
	private BorderPane borderPaneHome;

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

	public HomeController(Stage stage) {
		this.primaryStage = stage;
	}

	public BorderPane getBorderPaneHome() {
		return this.borderPaneHome;
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
