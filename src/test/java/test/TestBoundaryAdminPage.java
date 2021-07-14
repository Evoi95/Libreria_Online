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

class TestBoundaryAdminPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void raccolta() {
		Button b=(Button)GuiTest.find("#buttonR");
		clickOn("#buttonR");
		sleep(1000);
		assertEquals(b.getText(),"Gestione Report");
	}
	@Test
	public void libri()
	{
		Button b=(Button)GuiTest.find("#raccoltaB");
		clickOn("#raccoltaB");
		sleep(1000);
		assertEquals(b.getText(),"Gestione Raccolta");

	}
	@Test
	public void utenti()
	{
		Button b=(Button)GuiTest.find("#buttonU");

		clickOn("#buttonU");
		sleep(1000);
		assertEquals(b.getText(),"Gestione Utenti");

	}
	@Test
	public void torna()
	{
		Button b=(Button)GuiTest.find("#buttonL");

		clickOn("#buttonL");
		sleep(1000);
		assertEquals(b.getText(),"Logout");

	}
	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("adminPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
