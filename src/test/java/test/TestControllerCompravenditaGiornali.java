package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller_app.ControllerCompravenditaGiornali;
import controller_app.ControllerCompravenditaLibri;
import factoryBook.Raccolta;
import javafx.collections.ObservableList;
import users.User;

class TestControllerCompravenditaGiornali {
	private ControllerCompravenditaGiornali cCG;
	private boolean state;
	private ObservableList<Raccolta>catalogo;
	private String tipo;
	private static User u=User.getInstance();



	@Test
	void testGetGiornali() throws SQLException {
		cCG=new ControllerCompravenditaGiornali();
		String i="4";
		state=cCG.disponibilitaGiornale(i);
		assertEquals(true,state);
	
	}

	@Test
	void testDisponibilitaGiornale() throws SQLException {
		cCG=new ControllerCompravenditaGiornali();
		catalogo=cCG.getGiornali();
		state=catalogo.isEmpty();
		assertEquals(false,state);
	
	}

	@Test
	void testTipoUtente() {
		cCG=new ControllerCompravenditaGiornali();

		tipo=cCG.tipoUtente();
		
		if (tipo.equalsIgnoreCase("W") || tipo.equalsIgnoreCase("E") || tipo.equalsIgnoreCase("A")|| tipo.equalsIgnoreCase("U"))
			state=true;
		else
			state=false;
		assertEquals(true,state);

	}

}
