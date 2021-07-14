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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

class TestBoundaryPagamentoCash extends ApplicationTest {
	private boolean status=false;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("pagamentoContrassegno.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }
	@Test
	public void paga()
	{
		TextField tf=(TextField)GuiTest.find("#nomeTF");
		TextField tf1=(TextField)GuiTest.find("#cognomeTF");
		TextField tf2=(TextField)GuiTest.find("#viaTF");
		TextArea ta=(TextArea)GuiTest.find("#eventualiArea");
		clickOn("#nomeTF");
		write("pippo");
		clickOn("#cognomeTF");
		write("paperino");
		clickOn("#viaTF");
		write("via paperopoli 2");
		clickOn("#eventualiArea");
		write("la consegna dopo le ore 12.\n prego contatare via telefono");
		clickOn("#buttonI");
		sleep(2000);
		if(tf.getText()!=null && tf1.getText()!=null && tf2.getText()!=null && ta.getText()!=null)
			status=true;
		assertEquals(status,true);
		
	}
	@Test
	public void annulla()
	{
		Button b=(Button)GuiTest.find("#buttonA");
		clickOn("#buttonA");
		assertEquals(b.getText(),"Annulla");
	}

}
