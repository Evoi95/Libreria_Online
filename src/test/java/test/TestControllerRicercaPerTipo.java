package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller_app.ControllerRicercaPerTipo;
import controller_app.SystemState;

class TestControllerRicercaPerTipo {
	private ControllerRicercaPerTipo cRT=new ControllerRicercaPerTipo();
	private boolean state=false;

	@Test
	void testSetRicercaL() {
		SystemState.getIstance().setTypeAsBook();
		assertNotEquals(state,cRT.setRicercaL());
	}

	@Test
	void testSetRicercaG() {
		SystemState.getIstance().setTypeAsDaily();
		assertNotEquals(state,cRT.setRicercaG());	}

	@Test
	void testSetRicercaR() {
		SystemState.getIstance().setTypeAsMagazine();
		assertNotEquals(state,cRT.setRicercaR());
	}

}
