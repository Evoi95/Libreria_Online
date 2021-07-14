package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import boundaryLaptop.Main;
import controller_app.ControllerRivistaPage;
import controller_app.SystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class TestBoundaryRivistaPage extends ApplicationTest {
	private ControllerRivistaPage cRP=new ControllerRivistaPage();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void lista() throws SQLException {
		clickOn("#buttonG");
		sleep(2000);
		assertNotNull(cRP.getRivistaS());
	}
	@Test
	public void add()
	{
		clickOn("#buttonAdd");
		sleep(1000);
	}
	@Test
	public void modifica()
	{
		SystemState.getIstance().setId(2);
		clickOn("#modB");
		sleep(1000);
		assertNotNull(SystemState.getIstance().getId());
	}
	@Test
	public void elimina()
	{
		SystemState.getIstance().setId(13);

		clickOn("#buttonDel");
		sleep(1000);
		assertNotNull(SystemState.getIstance().getId());

	}
	@Test
	public void indietro()
	{
		Button b=(Button)GuiTest.find("#buttonB");
		clickOn("#buttonB");
		sleep(1000);
		assertEquals(b.getText(),"Indietro");
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("rivistaPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
}
