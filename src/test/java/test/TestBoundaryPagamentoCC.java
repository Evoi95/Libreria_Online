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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

class TestBoundaryPagamentoCC extends ApplicationTest {
	private boolean status=false;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach	
	void tearDown() throws Exception {
	}

	@Test
	public void registra() {
		TextField tf=(TextField)GuiTest.find("#codiceTF");
		TextField tf1=(TextField)GuiTest.find("#scadTF");
		TextField tf2=(TextField)GuiTest.find("#codiceTFCiv");

		

		Button b=(Button)GuiTest.find("#buttonReg");
		b.setDisable(false);
		clickOn("#nomeTF");
		write("minnie");
		clickOn("#cognomeTF");
		write("topolino");
		clickOn("#codiceTF");
		write("1965-1523-5256-6333");
		clickOn("#scadTF");
		write("2025/15/11");
		clickOn("#codiceTFCiv");
		write("253");
		clickOn("#buttonReg");
		sleep(1000);
		if(tf.getText()!=null && tf1.getText()!=null && tf2.getText()!=null)
			status=true;
		assertEquals(status,true);
		
		
		
	}
	@Test
	public void ritorna()
	{
		TextField tf=(TextField)GuiTest.find("#nomeInput");
		RadioButton b=(RadioButton)GuiTest.find("#buttonPrendi");
		b.setDisable(false);

		clickOn("#nomeInput");
		write("minnie");
		clickOn("#buttonPrendi");
		sleep(1000);
		assertNotNull(tf.getText());
		
		
	}
	@Test
	public void procedi()
	{
		
		TextField tf=(TextField)GuiTest.find("#codiceTF");
		TextField tf1=(TextField)GuiTest.find("#scadTF");
		TextField tf2=(TextField)GuiTest.find("#codiceTFCiv");
		clickOn("#codiceTF");
		write("1965-1523-5256-6333");
		clickOn("#scadTF");
		write("2025/15/11");
		clickOn("#codiceTFCiv");
		write("253");
		clickOn("#buttonI");
		sleep(1000);
		if(tf.getText()!=null && tf1.getText()!=null && tf2.getText()!=null)
			status=true;
		assertEquals(status,true);
	}
	@Test
	public void torna()
	{
		Button b=(Button)GuiTest.find("#buttonA");
		clickOn("#buttonA");
		sleep(1000);
		assertEquals(b.getText(),"Annulla");
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("pagamentoCC.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }

}
