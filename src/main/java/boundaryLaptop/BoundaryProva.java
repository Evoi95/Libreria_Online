package boundaryLaptop;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BoundaryProva {
	@FXML
	private Pane pane;
	@FXML
	private TextField tfF;
	@FXML
	private Button buttonC;
	@FXML
	private TextField tfI;
	
	private ControllerProva cP=new ControllerProva();
	
	protected Scene scene;

	
	@FXML
	private void copiaTesto() throws IOException
	{		
		tfF.setText(tfI.getText());

		if(cP.controlla(tfI.getText(),tfF.getText())==0)
			{
			Stage stage;
			Parent root;
			stage = (Stage) buttonC.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("Prova1.fxml"));
			//stage.setTitle("Benvenuto nella schermata dell'acquisto con carta credito");
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			stage.toFront();
			}
	}
	
	

}
