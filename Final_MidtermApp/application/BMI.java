package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class BMI {

	@FXML
	private RadioButton metricRadio;

	@FXML
	private RadioButton imperialRadio;

	@FXML
	private TextField weight;

	@FXML
	private TextField height;

	@FXML
	private Label bmiResultsLabel;

	@FXML
	private Label statusLabel;

	@FXML
	void handleButtonAction(ActionEvent event) {

		try {

			Double w = new Double(weight.getText());
			Double h = new Double(height.getText());
			double bmi_int;

			if(imperialRadio.isSelected()) {
				bmi_int = (w * 703.0)/(h*h);
				bmiResultsLabel.setText(String.format("%.2f", bmi_int));
				if (bmi_int < 18.5) {
					statusLabel.setText("underweight");
				} else if (bmi_int < 25) {
					statusLabel.setText("normal");
				} else if (bmi_int < 30) {
					statusLabel.setText("overweight");
				} else {
					statusLabel.setText("obese");
				}
			}


			else if(metricRadio.isSelected()) {
				bmi_int = (w/(h*h)) * 10000;	
				bmiResultsLabel.setText(String.format("%.2f", bmi_int));
				if (bmi_int < 18.5) {
					statusLabel.setText("underweight");
				} else if (bmi_int < 25) {
					statusLabel.setText("normal");
				} else if (bmi_int < 30) {
					statusLabel.setText("overweight");
				} else {
					statusLabel.setText("obese");
				}
			}

		}
		catch(NumberFormatException e) {

			weight.setText("Invalid Entry");
			weight.selectAll();
			weight.requestFocus();

			height.setText("Invalid Entry");
			height.selectAll();
		}
	}

}
