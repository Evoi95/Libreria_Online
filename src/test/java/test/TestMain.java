package test;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

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



class TestMain extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
/*
	@Test
	public void test() {
		clickOn("#tfF");
		write("aaaa");
	}
	*/
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("homePage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	  }
	
	@Test
	public void libri() throws IOException
	{
		
		SystemState.getIstance().setTypeAsBook();
		clickOn("#buttonL");
		assertEquals(SystemState.getIstance().getType(),"libro");
		
	}
	@Test
	public void riviste() throws IOException
	{
		SystemState.getIstance().setTypeAsMagazine();
		clickOn("#buttonR");
		assertEquals(SystemState.getIstance().getType(),"rivista");

		
	}
	@Test
	public void giornali() throws IOException
	{
		SystemState.getIstance().setTypeAsDaily();
		clickOn("#butonG");
		assertEquals(SystemState.getIstance().getType(),"giornale");

		
	}
	@Test
	public void cerca()
	{
		Button b=(Button)GuiTest.find("#buttonC");
		clickOn("#buttonC");
		sleep(1000);
		assertEquals(b.getText(),"Cerca");
	}
	@Test
	public void login()
	{
		Button b=(Button)GuiTest.find("#buttonLogin");

		clickOn("#buttonLogin");
		sleep(1000);
		assertEquals(b.getText(),"Login");

	}


}
