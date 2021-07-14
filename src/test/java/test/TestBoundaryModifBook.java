package test;
/*package boundaryLaptop;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import controller_app.SystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

class TestBoundaryModifBook extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void modifica() {
		SystemState.getIstance().setTypeAsBook();
		SystemState.getIstance().setId(21);
		DatePicker d=(DatePicker)GuiTest.find("#dataP");
		CheckBox c=(CheckBox)GuiTest.find("#disponibilitaC");
		d.setValue(LocalDate.of(2021,11,6));
		int dispo=0;
		
		clickOn("#titoloT");
		write("libro prova aggiornato");
		clickOn("#numeroPagineT");
		write("150");
		clickOn("#codeIsbnT");
		write("8817061666 ");
		clickOn("#editoreT");
		write("la terza");
		clickOn("#autoreT");
		write("garzanti");
		clickOn("#linguaT");
		write("ita-eng");
		clickOn("#categoriaTF");
		write("non so");
		clickOn("#recensioneT");
		write("alquanto inutile");
		clickOn("#descrizioneT");
		write("anche questo libro \n viene cancellato");
		clickOn("#disponibilitaC");
		if(c.isPressed())
			dispo=1;
		clickOn("#prezzoT");
		write("10.5");
		clickOn("#copieRimanentiT");
		write("20");
		clickOn("#buttonC");
		sleep(1000);
			
		
		
	}
	@Test
	public void indietro()
	{
		clickOn("#buttonA");
		sleep(1000);
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("modBookPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }

	

}*/
