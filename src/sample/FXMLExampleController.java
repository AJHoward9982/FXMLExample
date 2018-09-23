package fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {
  @FXML private Text onAction;

  @FXML protected void handleSubmitButtonAction(ActionEvent event) {
    onAction.setText("Sign in button pressed");
  }

}