package controller_app;

import java.sql.SQLException;
import java.util.logging.Level;

import database.LibroDao;
import factoryBook.Libro;
import logger.Log;

public class ControllerVisualizzaLibro {
	
	private LibroDao ld;
	private Libro b;
	private int tempIdLib;
	private SystemState vis = SystemState.getIstance() ;
	
	public ControllerVisualizzaLibro()
	{
		ld = new LibroDao();
	}
	public void setID(String i)
	{		
		tempIdLib = Integer.parseInt(i) ;
		vis.setId(tempIdLib);
	}
	public int getID()
	{
		Log.logger.log(Level.INFO,"{0}",vis.getId());
		return vis.getId();
	}
	public Libro getData(int i) throws SQLException
	{
		// imposto che è un libro nel controller
		vis.setTypeAsBook();
		return  ld.getLibro(b,i);
	}
}