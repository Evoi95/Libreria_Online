package test;
/*package boundaryLaptop;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import database.GiornaleDao;
import factoryBook.Giornale;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

class TestBoundaryModifGiornale extends ApplicationTest {
	private GiornaleDao gd=new GiornaleDao();
	private Giornale g;

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Before
	public void carica()
	{
		
	}
	@Test
	public void modifica() {
		//idea di prendere da db
		
		DatePicker d=(DatePicker)GuiTest.find("#dataP");
		d.setValue(LocalDate.of(2021, 9, 6));
		/*
		clickOn("#labelT");
		write(gd.getGiornaliSingoloById(g).get(0).getTitolo());
		clickOn("#labelTipo");
		write(gd.getGiornaliSingoloById(g).get(0).getTipologia());
		clickOn("#labelE");
		write(gd.getGiornaliSingoloById(g).get(0).getEditore());
		clickOn("#labelLingua");
		write(gd.getGiornaliSingoloById(g).get(0).getLingua());
		clickOn("#labelData");
		write(gd.getGiornaliSingoloById(g).get(0).getDataPubb().toString());
		clickOn("#labelDisp");
		write(""+gd.getGiornaliSingoloById(g).get(0).getDisponibilita());
		clickOn("#labelP");
		write(""+gd.getGiornaliSingoloById(g).get(0).getPrezzo());
		clickOn("#labelCopie");
		write(""+gd.getGiornaliSingoloById(g).get(0).getCopieRimanenti());
		
		clickOn("#titoloT");
		write("Il Fatto Quotidiano 1");
		clickOn("#tipologiaT");
		write("cuiosita");
		clickOn("#editoreT");
		write("hoepli");
		clickOn("#linguaT");
		write("ita-eng");
		clickOn("#disponibilitaC");
		clickOn("#prezzoT");
		write("1.90");
		clickOn("#copieRimanentiT");
		write("12");
		clickOn("#buttonC");
		sleep(1000);
		
	}
	@Test
	public void torna()
	{
		clickOn("#buttonA");
		sleep(1000);
	}
	
	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("modGiornalePage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }

}
*/