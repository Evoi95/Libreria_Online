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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

class TestBoundaryResetPwd extends ApplicationTest {
	private boolean status=false;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void resetPass() {
		TextField tf=(TextField)GuiTest.find("#emailTF");
		PasswordField pf1=(PasswordField)GuiTest.find("#vecchiaPF");
		PasswordField pf2=(PasswordField)GuiTest.find("#nuovaPF");

		clickOn("#emailTF");
		write("franco@gialli.com");
		clickOn("#vecchiaPF");
		write("franco156");
		clickOn("#nuovaPF");
		write("francogi156");
		clickOn("#buttonC");
		sleep(1000);
		if(tf.getText()!=null && pf1.getText()!=null && pf2.getText()!=null && pf1.getText()!=pf2.getText())
			status=true;
		assertEquals(status,true);
	}
	@Test
	public void torna()
	{
		Button b=(Button)GuiTest.find("#buttonH");
		clickOn("#buttonH");
		sleep(1000);
		assertEquals(b.getText(),"Home page");
	}
	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("resetPwd.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }

}
