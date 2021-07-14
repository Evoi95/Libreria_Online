package controller_app;

import users.User;

public class ControllerReportRaccolta {
	private static User u=User.getInstance();
	
	public String getTipo()
	{
		return u.getIdRuolo();
	}

}
