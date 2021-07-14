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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import users.User;

class TestBoundaryBSORegister extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void registraUtente() {
		DatePicker cal=(DatePicker)GuiTest.find("#calendarL");
		LocalDate date=LocalDate.of(1965, 8, 6);
		clickOn("#nomeTF");
		write("mario");
		clickOn("#cognomeTF");
		write("rossi");
		clickOn("#emailTF");
		write("mariorossi@gmail.com");
		clickOn("#passwordTF");
		write("marioro852");
		clickOn("#passCheckTF");
		write("marioro852");
		clickOn("#calendarL");
		write("05/10/1965");
		User.getInstance().setNome("mario");
		User.getInstance().setCognome("rossi");
		User.getInstance().setEmail("mariorossi@gmail.com");
		User.getInstance().setPassword("marioro852");
		User.getInstance().setDataDiNascita(cal.getValue());
		User.getInstance().setIdRuolo("e");	
		User.getInstance().setDescrizione("tipo socievole");
		
		clickOn("#buttonReg");

		sleep(2000);
		assertNotNull(User.getInstance());
	}
	
	@Test
	public void annulla()
	{
		Button b=(Button)GuiTest.find("#buttonA");
		clickOn("#buttonA");
		assertEquals(b.getText(),"Annulla");
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("bsoRegister.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
	
}
