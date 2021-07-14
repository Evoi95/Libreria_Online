package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller_app.ControllerCancUser;
import users.TempUser;

class TestControllerCancUser {
	private static TempUser u=TempUser.getInstance();

	private ControllerCancUser cCU=new ControllerCancUser();

	@Test
	void testCancellaUtente() {
		u.setIdU(1);
		cCU.cancellaUtente(u.getIdU());
	}

}
