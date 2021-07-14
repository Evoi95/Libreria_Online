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

class TestBoundaryDownload extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void scarica() {
		Button d=(Button)GuiTest.find("#buttonI");
		clickOn("#buttonI");
		assertEquals(d.getText(),"Download");
	}
	@Test
	public void torna() {
		Button d=(Button)GuiTest.find("#buttonA");
		clickOn("#buttonA");
		assertEquals(d.getText(),"Annulla");
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("download.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
