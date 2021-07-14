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

class TestBoundaryLoginPage extends ApplicationTest {
	private boolean state=false;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void login()
	{
		TextField tf=(TextField)GuiTest.find("#textFieldUsername");
		PasswordField tf1=(PasswordField)GuiTest.find("#pwdField");
		

		clickOn("#textFieldUsername");
		write("admin@admin.com");
		clickOn("#pwdField");
		write("admin871");
		clickOn("#buttonI");
		if(tf.getText()!= null && tf1.getText()!=null)
			state=true;
		sleep(2000);
		assertEquals(state,true);
		
	}
	@Test
	public void registra()
	{
		Button b=(Button)GuiTest.find("#buttonReg");
		clickOn("#buttonReg");
		sleep(2000);
		assertEquals(b.getText(),"Registrati");
		
	}
	@Test
	public void annulla()
	{
		Button b=(Button)GuiTest.find("#buttonA");

		clickOn("#buttonA");
		sleep(1000);
		assertEquals(b.getText(),"Annulla");

	}
	@Test
	public void resetPwd()
	{
		Button b=(Button)GuiTest.find("#buttonReset");

		clickOn("#buttonReset");
		sleep(2000);
		assertEquals(b.getText(),"Reset Password");

	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("loginPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
	

}
