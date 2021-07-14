package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import boundaryLaptop.Main;
import database.UsersDao;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import users.User;

class TestBoundaryVisualizzaProfilo extends  ApplicationTest{

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@Test
	public void dati() {
		User.getInstance().setNome("mario");
		User.getInstance().setCognome("rossi");
		User.getInstance().setEmail("mariorossi@gmail.com ");
		User.getInstance().setDataDiNascita(LocalDate.of(1960,11,21 ));
		//clickOn("#labelInsN");
		//System.out.println("aaaa"+UsersDao.pickData(User.getInstance()).getNome());
		clickOn("#buttonCred");
		sleep(1000);
		assertNotNull(User.getInstance());
		
	}
	@Test
	public void indietro()
	{
		Button b=(Button)GuiTest.find("#indietroB");
		clickOn("#indietroB");
		sleep(1000);
		assertEquals(b.getText(),"Indietro");
	}
	@Test
	public void modifica()
	{
		Button b=(Button)GuiTest.find("#modificaB");

		clickOn("#modificaB");
		sleep(1000);
		assertEquals(b.getText(),"Modifica Profilo");

	}
	@Test
	public void cronologia()
	{
		Button b=(Button)GuiTest.find("#cronologiaB");

		clickOn("#cronologiaB");
		sleep(1000);
		assertEquals(b.getText(),"Cronologia Ordini");

	}
	@Test
	public void cancella()
	{
		Button b=(Button)GuiTest.find("#cancellaB");
		User.getInstance().setEmail("mariorossi@gmail.com");
		User.getInstance().setIdRuolo("u");
		clickOn("#cancellaB");
		sleep(1000);
		assertEquals(b.getText(),"Cancella Profilo");
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("visualizzaProfilo.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
