import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FGCApp extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	//stage is the main screen that holds the game
	public void start(Stage stage)
	{
		System.out.println("hello World");
	}
}