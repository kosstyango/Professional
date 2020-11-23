package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
   @FXML
    TextArea message;

    @FXML
    TextField text;

    @FXML
    private void send(){
    String str = text.getText();
    message.appendText(str + "\n");
    text.clear();
    text.requestFocus();

    }
}
