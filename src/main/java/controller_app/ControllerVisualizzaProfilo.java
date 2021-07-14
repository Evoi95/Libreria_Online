package controller_app;

import database.UsersDao;
import users.User;

public class ControllerVisualizzaProfilo {
	private UsersDao uD;
	private boolean status=false;

	public User getCredenziali() {
		
		return UsersDao.pickData(User.getInstance());
		
	}
	
	public ControllerVisualizzaProfilo()
	{
		uD=new UsersDao();
	}

	public boolean cancellaUtente() {
		if(UsersDao.deleteUser(User.getInstance()))
		{
			User.getInstance().setNull();
			status=true;
		}
		System.out.println("Status in controller :"+status);
		return status;

		}
}
		
		
		
		
	


