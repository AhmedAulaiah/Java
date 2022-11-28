package thegui.u11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.Scanner;

public class GUI extends Application {

	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {

		// Eingabe	

		String nameTextField = "nameOfFile";  // Name der Textdatei
		String fileInSystem = System.getProperty("user.dir") + File.separator + ""+ ".txt";

		primaryStage.setTitle("TextIO");
		VBox vBox = new VBox(10);
		vBox.setAlignment(Pos.TOP_LEFT);
		Scene scene = new Scene(vBox, 400, 400);

		// Label
		Label label = new Label("NOTHING");

		// Text Area
		TextArea area = new TextArea(" ");

		// Textfield
		TextField field = new TextField(nameTextField);
		field.setPadding(new Insets(10));



		// first Button
		Button firstButton = new Button("SAVE");
		firstButton.setOnAction(actionEvent -> {
			if(fileInSystem != null) {
				try {
					IOString.schreibeInDatei(area.getText(), field.getText());
					label.setText("File saved" +"\n" );
				} catch (Exception exception) {
					label.setText(exception + "\n " +"Error in writing file " +"\n" );
				}
			}

		});

		// second Button
		Button secondButton = new Button("SHOW");
		secondButton.setOnAction(actionEvent -> {
			if(fileInSystem != null) {
				try {
					String text = IOString.leseAusDatei(field.getText());
					area.setText(text);
					label.setText("File will be shown" +"\n" );
				} catch (Exception e) {
					label.setText(e + "\n" +"Error with reading the file" +"\n" );
				}
			}
		});

		vBox.getChildren().addAll(firstButton, secondButton, field, area, label);

		primaryStage.setScene(scene);
		primaryStage.show();
	}


}