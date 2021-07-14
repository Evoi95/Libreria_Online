package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import boundaryLaptop.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class TestBoundaryReportPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void reportTotale() {
		Button b=(Button)GuiTest.find("#totaleB");
		clickOn("#totaleB");
		sleep(2000);
		assertEquals(b.getText(),"Totale");
	}

	@Test
	public void reportLibri() {
		Button b=(Button)GuiTest.find("#libroB");

		clickOn("#libroB");
		sleep(2000);
		assertEquals(b.getText(),"Libri");

	}
	
	@Test
	public void reportGiornali() {
		Button b=(Button)GuiTest.find("#giornaliB");

		clickOn("#giornaliB");
		sleep(2000);
		assertEquals(b.getText(),"Giornali");

		
	}
	
	@Test
	public void reportRaccolta() {
		Button b=(Button)GuiTest.find("#raccoltaB");

		clickOn("#raccoltaB");
		sleep(2000);
		assertEquals(b.getText(),"Raccolta");

	}
	@Test
	public void reportRiviste() {
		Button b=(Button)GuiTest.find("#rivisteB");

		clickOn("#rivisteB");
		sleep(2000);
		assertEquals(b.getText(),"Riviste");

	}
	@Test
	public void indietro()
	{
		Button b=(Button)GuiTest.find("#buttonI");

		clickOn("#buttonI");
		sleep(2000);
		assertEquals(b.getText(),"Indietro");
	}
	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("reportPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	    
	    
	  }

}
