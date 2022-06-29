import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Button;


import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;


public class CipherGUI extends Application {

	public static void main(String []args)
	{
		launch(args);
	}

	@Override
	public void start(Stage arg1) throws Exception {
		// TODO Auto-generated method stub
		arg1.setTitle("Cipher Tool");
		FlowPane pane1 = new FlowPane();
		Button button1 = new Button("Decrypt");
		Button button2 = new Button("Encrypt");
		
		pane1.getChildren().add(button1);
		pane1.getChildren().add(button2);
		
		Scene scene1 = new Scene(pane1, 200, 200);
		arg1.setScene(scene1);
		arg1.show();
		
		
	}
	

	

}