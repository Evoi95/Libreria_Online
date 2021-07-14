package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import boundaryLaptop.Main;
import controller_app.SystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class TestBoundaryRaccoltaPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void giornali() {
		Button b=(Button)GuiTest.find("#buttonG");
		clickOn("#buttonG");
		sleep(1000);
		assertEquals(b.getText(),"Giornali");
	}
	@Test
	public void riviste()
	{
		Button b=(Button)GuiTest.find("#rivisteB");

		clickOn("#rivisteB");
		sleep(1000);
		assertEquals(b.getText(),"Riviste");

	}
	@Test
	public void libri()
	{
		Button b=(Button)GuiTest.find("#libriB");

		clickOn("#libriB");
		sleep(1000);
		assertEquals(b.getText(),"Libri");

	}

	 @Test
	 public void indietro()
	 {
		 SystemState.getIstance().setIsLogged(false);
			Button b=(Button)GuiTest.find("#buttonI");

		clickOn("#buttonI");
		sleep(1000);
		assertEquals(b.getText(),"Indietro");

		
	 }
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("raccoltaPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }
}
