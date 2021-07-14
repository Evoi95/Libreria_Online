package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller_app.SystemState;

class TestSingeltonSystemState {

	@Test
	void testGetIstance() {
		assertNotNull(SystemState.getIstance());
	}

	@Test
	void testGetId() {
		SystemState.getIstance().setId(2);
		assertNotEquals(0,SystemState.getIstance().getId());
	}

	@Test
	void testSetId() {
		 SystemState.getIstance().setId(3);
		assertNotEquals(0,SystemState.getIstance().getId());


	}

	@Test
	void testSetTypeAsBook() {
		SystemState.getIstance().setTypeAsBook();
		assertEquals("libro",SystemState.getIstance().getType());

	}

	@Test
	void testSetTypeAsMagazine() {
		SystemState.getIstance().setTypeAsMagazine();
		assertEquals("rivista",SystemState.getIstance().getType());
	}

	@Test
	void testSetTypeAsDaily() {
		SystemState.getIstance().setTypeAsDaily();
		assertEquals("giornale",SystemState.getIstance().getType());
	}

	@Test
	void testGetType() {
		SystemState.getIstance().setTypeAsBook();
		assertEquals("libro",SystemState.getIstance().getType());
	}
	@Test
	void testGetType1() {
		SystemState.getIstance().setTypeAsMagazine();
		assertEquals("rivista",SystemState.getIstance().getType());
	}
	@Test
	void testGetType2() {
		SystemState.getIstance().setTypeAsDaily();
		assertEquals("giornale",SystemState.getIstance().getType());
	}

	@Test
	void testGetIsLogged() {
		
			SystemState.getIstance().setIsLogged(false);
			assertEquals(false,SystemState.getIstance().getIsLogged());
		
	}
	@Test
	void testGetIsLogged1() {
		
			SystemState.getIstance().setIsLogged(true);
			assertEquals(true,SystemState.getIstance().getIsLogged());
		
	}

	@Test
	void testSetIsLogged() {
		SystemState.getIstance().setIsLogged(true);
		assertEquals(true,SystemState.getIstance().getIsLogged());
	
	}

	@Test
	void testGetIsSearch() {
		SystemState.getIstance().setIsSearch(true);
		assertEquals(true,SystemState.getIstance().getIsSearch());

		
	}

	@Test
	void testSetIsSearch() {
		SystemState.getIstance().setIsSearch(true);
	}

	@Test
	void testGetIsPickup() {
		SystemState.getIstance().setPickup(true);
		assertEquals(true,SystemState.getIstance().getIsPickup());

		

	}

	@Test
	void testSetPickup() {
		SystemState.getIstance().setPickup(false);
	}

}
