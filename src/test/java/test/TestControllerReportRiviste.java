package test;


import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller_app.ControllerReportRiviste;

class TestControllerReportRiviste {
	private ControllerReportRiviste cRR= new ControllerReportRiviste();

	@Test
	void testGeneraReportRiviste() {
		try {
			cRR.generaReportRiviste();
		} catch (IOException | SQLException e) {
		 
			}
		}

}
