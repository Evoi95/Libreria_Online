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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

class TestBoundaryUserPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void lista() {
		Button b=(Button)GuiTest.find("#buttonP");
		clickOn("#buttonP");//fail("Not yet implemented");
		sleep(1000);
		assertEquals(b.getText(),"Prendi lista");
	}
	@Test
	public void aggiungi()
	{
		Button b=(Button)GuiTest.find("#buttonA");

		clickOn("#buttonA");
		sleep(1000);
		assertEquals(b.getText(),"Aggiungi");

	}
	@Test
	public void modifica()
	{
		TextField tf=(TextField)GuiTest.find("#utenteTF");
		clickOn("#utenteTF");
		write("8");
		clickOn("#buttonM");
		sleep(1000);
		assertNotNull(tf.getText());
	}
	
	@Test
	public void cancella()
	{
		TextField tf=(TextField)GuiTest.find("#utenteTF");

		clickOn("#utenteTF");
		write("16");
		clickOn("#buttonC");
		sleep(1000);
		assertNotNull(tf.getText());

	}
	@Test
	public void indietro()
	{
		Button b=(Button)GuiTest.find("#indietro");
		clickOn("#indietro");
		sleep(1000);
		assertEquals(b.getText(),"indietro");
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("userPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	    
	    
	  }

}
