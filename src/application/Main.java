package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.mainWindow();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void mainWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/application/MainWindowView.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			
			MainWindowController controller = loader.getController();
			controller.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}












