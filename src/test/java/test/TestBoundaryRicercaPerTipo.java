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

class TestBoundaryRicercaPerTipo extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void libri() {
		Button b=(Button)GuiTest.find("#buttonL");
		clickOn("#buttonL");
		assertEquals(b.getText(),"Libri");
	}
	@Test
	public void riviste() {
		Button b=(Button)GuiTest.find("#buttonR");

		clickOn("#buttonR");
		assertEquals(b.getText(),"Rivista");

	}@Test
	public void giornali() {
		Button b=(Button)GuiTest.find("#buttonG");

		clickOn("#buttonG");
		assertEquals(b.getText(),"Giornale");

	}
	@Test
	public void indietro() {
		Button b=(Button)GuiTest.find("#buttonB");

		clickOn("#buttonB");
		assertEquals(b.getText(),"Indieto");

	}


	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("ricercaPerTipo.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }
}
