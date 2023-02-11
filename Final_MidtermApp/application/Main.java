package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		//	BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("BMI.fxml"));
		//	FXMLLoader fxmlLoader = FXMLLoader.load(getClass().getResource("BMI.fxml"));
			
		//	fxmlLoader.setController(new CalcController());
			Scene scene = new Scene(root);
		//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("BMI Calculator");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
