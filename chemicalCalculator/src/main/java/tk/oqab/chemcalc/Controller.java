package tk.oqab.chemcalc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.controlsfx.control.textfield.TextFields;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField theField;
    @FXML
    private Text title1;
    @FXML
    private Text contentText;
    @FXML
    private Text resMsg;
    @FXML
    private Text result;
    @FXML
    private Text errorMsg;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TextFields.bindAutoCompletion(theField, ElementsInfo.getCompoundsList()).setPrefWidth(374);
    }

    @FXML
    public void getResult() {

        String input = theField.getText().trim();
        List<String> list = Utilities.splitCompound(input);


        if (list == null) {
            errorMsg.setVisible(true);
            return;
        }


        String content = "";
        for (String s : list) content += s + ", ";

        title1.setVisible(true);
        contentText.setText("" + "\n" + content.substring(0, content.length() - 2));

        double mass = Math.round(Utilities.getMolarMass(input) * 100) / 100.0;
        resMsg.setText(" الكتلة المولية للمركب تساوي: ");
        result.setText(mass + " g/mol");


    }


    @FXML
    public void resetErrorMsg() {
        errorMsg.setVisible(false);
    }
}
