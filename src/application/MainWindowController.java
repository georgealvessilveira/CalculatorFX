package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainWindowController {
	
	@FXML Label display;
	@FXML Button ac, conversion;
	
	private Main main;
	
	public MainWindowController setMain(Main main) {
		this.main = main;
		return this;
	}
}
