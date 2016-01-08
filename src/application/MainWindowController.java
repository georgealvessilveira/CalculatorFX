package application;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainWindowController {

	@FXML Label display;
	@FXML Button ac, conversion;

	private Main main;

	public void operatorPressed(Event event) {
		Button btn = (Button) event.getSource();
		switch(btn.getId()) {
			case "plus":
				System.out.println("+");
				break;
			case "minus":
				System.out.println("-");
				break;
			case "times":
				System.out.println("*");
				break;
			case "divided":
				System.out.println("/");
				break;
		}
	}

	public void buttonPressed(Event event) {
		Button btn = (Button) event.getSource();
		switch(btn.getId()) {
			case "one":
				System.out.println("one");
				break;
			case "two":
				System.out.println("two");
				break;
			case "three":
				System.out.println("three");
				break;
			case "four":
				System.out.println("four");
				break;
			case "five":
				System.out.println("five");
				break;
			case "six":
				System.out.println("six");
				break;
			case "seven":
				System.out.println("seven");
				break;
			case "eight":
				System.out.println("eight");
				break;
			case "nine":
				System.out.println("nine");
				break;
			case "zero":
				System.out.println("zero");
				break;
		}
	}
	
	public void delete() {
		
	}
	
	public void result() {
		
	}
	
	public void conversion() {
		
	}
	
	public void percent() {
		
	}
	
	public MainWindowController setMain(Main main) {
		this.main = main;
		return this;
	}
}
