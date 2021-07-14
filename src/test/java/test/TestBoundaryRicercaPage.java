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

class TestBoundaryRicercaPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void ricercaLibroTitolo()
	{
		SystemState.getIstance().setTypeAsBook();
		clickOn("#cercaT");
		write("Il libro dello splendore");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SystemState.getIstance().getType(),"libro");
		
	}
	@Test
	public void ricercaLibroAutore()
	{
		SystemState.getIstance().setTypeAsBook();
		clickOn("#cercaT");
		write("Zerocalcare");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SystemState.getIstance().getType(),"libro");

		
	}
	@Test
	public void ricercaLibroId()
	{
		SystemState.getIstance().setTypeAsBook();
		clickOn("#idT");
		write("6");
		SystemState.getIstance().setId(5);
		clickOn("#buttonV");
		sleep(2000);
		assertNotNull(SystemState.getIstance().getId());
		
	}
	@Test
	public void ricercaGiornaleTitolo()
	{
		SystemState.getIstance().setTypeAsDaily();
		clickOn("#cercaT");
		write("la gazzetta del profeta");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SystemState.getIstance().getType(),"giornale");

		
	}
	@Test
	public void ricercaLibroEditore()
	{
		SystemState.getIstance().setTypeAsDaily();
		clickOn("#cercaT");
		write("il ministero");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SystemState.getIstance().getType(),"giornale");

		
	}
	@Test
	public void ricercaGiornaleId()
	{
		SystemState.getIstance().setTypeAsDaily();
		clickOn("#idT");
		write("3");
		SystemState.getIstance().setId(3);
		clickOn("#buttonV");
		sleep(2000);
		assertNotNull(SystemState.getIstance().getId());
		
	}
	
	@Test
	public void ricercaRivistaTitolo()
	{
		SystemState.getIstance().setTypeAsMagazine();
		clickOn("#cercaT");
		write("focus");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SystemState.getIstance().getType(),"rivista");

		
	}
	
	@Test
	public void ricercaRivistaAutore()
	{
		SystemState.getIstance().setTypeAsMagazine();
		clickOn("#cercaT");
		write("Bao Publishing");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SystemState.getIstance().getType(),"rivista");

		
	}
	
	@Test
	public void ricercaRivistaId()
	{
		SystemState.getIstance().setTypeAsMagazine();
		clickOn("#idT");
		write("5");
		clickOn("#buttonV");
		sleep(2000);
		assertNotNull(SystemState.getIstance().getId());
		
	}
	
	@Test
	public void indietro()
	{
		Button b=(Button)GuiTest.find("#buttonB");
		clickOn("#buttonB");
		assertEquals(b.getText(),"Indietro");
	}

	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("ricercaPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
	

}
