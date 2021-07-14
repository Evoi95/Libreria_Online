package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import boundaryLaptop.Main;
import controller_app.ControllerCompravenditaRiviste;
import controller_app.SystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class TestBoundaryCompravenditaRiviste extends ApplicationTest {
	private ControllerCompravenditaRiviste cCR=new ControllerCompravenditaRiviste();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void popolaTabella() throws SQLException
	{
		clickOn("#entryText");
		clickOn("#buttonL");
		sleep(2000);
		assertNotNull(cCR.getRiviste());
	}
	@Test
	public void mostra()
	{
		clickOn("#entryText");
		write("2");
		clickOn("#buttonV");
		sleep(2000);
		assertNotNull(SystemState.getIstance().getId());

	}
	@Test
	public void procedi()
	{
		clickOn("#entryText");
		write("2");
		clickOn("#buttonA");
		sleep(2000);
		assertNotNull(SystemState.getIstance().getId());

		
	}
	@Test
	public void torna()
	{
		Button b=(Button)GuiTest.find("#buttonI");
		clickOn("#buttonI");
		assertEquals(b.getText(),"Home Page");
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("compravenditaRivista.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
}
