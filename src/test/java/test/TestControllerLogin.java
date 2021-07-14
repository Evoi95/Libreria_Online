package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller_app.ControllerLogin;

class TestControllerLogin {
	
	private boolean state;
	private String ruolo;
	private ControllerLogin cL;
	String email,pass;

	@Test
	void testControlla() {
		cL=new ControllerLogin();
		
		
		email="Admin@Admin.com";
		pass="Admin871";
		
		
		try {
			state=cL.controlla(email,pass/*User.getInstance().getEmail(),User.getInstance().getPassword()*/);
		} catch (SQLException e) {
		 
			
		}	
		assertEquals(true,state);//fail("Not yet implemented");
	}

	@Test
	void testGetRuoloTempUSer() {
		cL=new ControllerLogin();
		email="baoPublishing@gmail.com";
		ruolo=cL.getRuoloTempUSer(email);
		System.out.print(ruolo);
		assertEquals("E",ruolo);
		
	}

}
