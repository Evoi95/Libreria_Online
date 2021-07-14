package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import boundaryLaptop.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

class TestBoundaryAcquistaLibro extends ApplicationTest {
	


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@Test
	public void provaCalcolo() throws SQLException {
		Label totale=(Label)GuiTest.find("#totale");
		
				
		clickOn("#quantita");
		write("5");
		clickOn("#calcola");
		sleep(3000);
		assertNotNull(totale.getText());
	//	clickOn("#ritiroN");
		//clickOn("#buttonCC");
		
		
		}
	@Test
	public void torna()
	{
		clickOn("#link");
		sleep(1000);
	}
	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("acquista.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	    
	    
	  }
	@Test
	public void pagaCC()
	{
		Label l=(Label)GuiTest.find("#nome");
		RadioButton b=(RadioButton)GuiTest.find("#buttonCC");
		b.setDisable(false);
		clickOn("#buttonCC");
		sleep(1000);
		assertNotNull(l.getText());
	}
	@Test
	public void pagaCash()
	{
		Label l=(Label)GuiTest.find("#nome");

		RadioButton b=(RadioButton)GuiTest.find("#buttonCash");
		b.setDisable(false);
		clickOn("#buttonCash");
		sleep(1000);
		assertNotNull(l.getText());

	}
	
	

}
