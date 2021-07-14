package controller_app;

import java.util.logging.Level;

import logger.Log;
import users.User;

public class ControllerHomePageAfterLoginSE {
	private static User U = User.getInstance();
	private static SystemState vis = SystemState.getIstance() ;

	// qui ci va la funzione di logout
	
	public static boolean logout() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{	
		
		String n = U.getNome();
		Log.logger.log(Level.INFO,"Stai sloggando con il nome di : {0}", n );
		U.setNull();
		
		if(U.getEmail() == null && U.getIdRuolo() == null)
		{
			Log.logger.log(Level.INFO,"Logout  utente {0}",U.getEmail());
			vis.setIsLogged(false);
			return true;
		}
		
		return false;
		
	}


}
