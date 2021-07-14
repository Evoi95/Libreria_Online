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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

class TestBoundaryScegliNegozio extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void negozioA() {
		RadioButton r1=(RadioButton)GuiTest.find("#radio1");
		clickOn("#radio1");
		clickOn("#buttonV");
		assertEquals(r1.getText(),"Negozio A");
	}
	@Test
	public void negozioB() {
		RadioButton r2=(RadioButton)GuiTest.find("#radio2");
		clickOn("#radio2");
		clickOn("#buttonV");
		assertEquals(r2.getText(),"Negozio B");
	}
	@Test
	public void negozioC() {
		RadioButton r3=(RadioButton)GuiTest.find("#radio3");
		clickOn("#radio3");
		clickOn("#buttonV");
		assertEquals(r3.getText(),"Negozio C");
	}
	@Test
	public void negozioD() {
		RadioButton r4=(RadioButton)GuiTest.find("#radio4");
		clickOn("#radio4");
		clickOn("#buttonV");
		assertEquals(r4.getText(),"Negozio D");
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("scegliNegozio.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
