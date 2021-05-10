package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btText;
	
	@FXML
	private void onBtTextAction(){
		System.out.println("Click");
	}
}
