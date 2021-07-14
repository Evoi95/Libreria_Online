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
import javafx.stage.Stage;

class TestBoundaryAddUSerPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void inserisciUtente() {
		
		DatePicker dataP=(DatePicker)GuiTest.find("#dataN");
		dataP.setValue(LocalDate.of(1980,4,3));
		clickOn("#nomeTF");
		write("franco");
		clickOn("#cognomeTF");
		write("gialli");
		clickOn("#emailTF");
		write("franco@gialli.com");
		clickOn("#pwdTF");
		write("franco156");
		clickOn("#descTA");
		write("un grande uomo \n ma con carattere permaloso");
		clickOn("#ruoloTF");
		write("a");
		clickOn("#insB");
		sleep(1000);
		assertNotNull(dataP.getValue());
		
	}
	@Test
	public void torna()
	{
		clickOn("#annB");
		sleep(1000);
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("addUserPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
