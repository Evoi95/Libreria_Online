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

class TestBoundaryAddBookPage extends ApplicationTest{

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void addBook() {
		ListView<String> lista=(ListView)GuiTest.find("#categoriaList");
		DatePicker dataP=(DatePicker)GuiTest.find("#dataP");
		dataP.setValue(LocalDate.of(2021,9 ,5));
		clickOn("#titoloT");
		write("libro prova");
		clickOn("#numeroPagineT");
		write("152");
		clickOn("#codeIsbnT");
		write("8817061663");
		clickOn("#editoreT");
		write("garzanti");
		clickOn("#autoreT");
		write("garzanti");
		clickOn("#linguaT");
		write("italiana");
		lista.getItems().get(2);		
		clickOn("#dataP");
		clickOn("#recensioneT");
		write("libro inserito di prova");
		clickOn("#descrizioneA");
		write("questo libro stamato per prova \n a breve eliminato");
		clickOn("#disponibilitaC");
		clickOn("#prezzoT");
		write("11.5");
		clickOn("#copieRimanentiT");
		write("5");
		clickOn("#buttonC");		
		sleep(2000);
		assertNotNull(dataP.getValue());
		
	}
	@Test
	public void torna()
	{
		clickOn("#buttonA");
		sleep(1000);
	}
	

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("addBookPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
