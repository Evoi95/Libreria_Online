package controller_app;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.regex.Pattern;
import logger.Log;
import users.User;
import database.UsersDao;

public class ControllerBsoRegister {
	private Boolean state=false;
	private UsersDao uD ;
	private User u=User.getInstance();

	public Boolean registra(String n, String c, String email, String pwd, String pwdC, LocalDate LocalDate) throws SQLException {
		
		
		u.setEmail(email);
		u.setPassword(pwd);
		u.setDataDiNascita(LocalDate);
		

		

		
		if(Boolean.TRUE.equals(checkData ( n,c,email,pwd,pwdC)) )
		{
			if (UsersDao.checkUser(u) == 0)
			{
				// nuovo utente creo l'account
				u.setNome(n);
				u.setCognome(c);
				
				//Log.logger.log(Level.INFO,"data in controller {0}",u.getDataDiNascita());
				state=uD.createUser(u);
			}
			else if (UsersDao.checkUser(u) == 1 || UsersDao.checkUser(u) == -1)
			{
				// utente gia registrato o errore 
				Log.logger.log(Level.INFO,"User registered yet");		

				//state = false;
			}
		}
		else {
			Log.logger.log(Level.INFO,"error generic yet");		
		}
		
		Log.logger.log(Level.INFO,"state in controller {0}",state);		

		return state;
	}
	
	
	//le chiamo protected perchele uso nel controller stesso e basta 
	public boolean checkData (String n, String c, String email, String pwd, String pwdC)
	// controll  all data
	{
		if(checkEmail(email) && checkPassword(pwd,pwdC) && checkNomeCognome(n,c))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean checkEmail(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
			return false; 
		return pat.matcher(email).matches();
	}
    
	public boolean checkPassword(String pwd, String pwdC )
	{
		if(pwd.length()>=8 && pwdC.length()>=8 && pwd.equals(pwdC)) {
			return true;
		}
		else
		{
			return false;
			// to do : approfondire regex password
		}
	}
	
	public boolean checkNomeCognome(String n, String c)
	{
		if (n != null && c != null)
		{
			return true;
		}else {
		return false;
		}
	}
	
	public ControllerBsoRegister()
	{
		//U.getInstance();
		uD=new UsersDao();
	}
	
	// TO DO: checkData o lo facciamo diretti in mysql
}
