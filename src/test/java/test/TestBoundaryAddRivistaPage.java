package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import boundaryLaptop.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

class TestBoundaryAddRivistaPage extends ApplicationTest{

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void addRivista() {
		DatePicker dataP=(DatePicker)GuiTest.find("#datePick");
		dataP.setValue(LocalDate.of(2021,9 ,5));
		clickOn("#titoloTF");
		write("rivista prova");
		clickOn("#tipologiaTF");
		write("informatica");		
		clickOn("#autoreTF");
		write("garzanti");
		clickOn("#linguaTF");
		write("italiana");
		clickOn("#editoreTF");
		write("garzanti");
		clickOn("#descTA");
		write("mensile su aggiornamenti in ambito informatico");		
		clickOn("#datePick");
		clickOn("#dispCheck");
		clickOn("#prezzoTF");
		write("11.5");
		clickOn("#copieTF");
		write("10");
		clickOn("#buttonAdd");		
		sleep(2000);
		assertNotNull(dataP.getValue());
		
	}
	@Test
	public void torna()
	{
		clickOn("#buttonI");
		sleep(1000);
	}
	

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("addRivistaPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
}
