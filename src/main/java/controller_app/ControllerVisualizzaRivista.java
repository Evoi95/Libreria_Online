package controller_app;

import java.sql.SQLException;
import java.util.logging.Level;

import database.RivistaDao;
import factoryBook.Rivista;
import logger.Log;

public class ControllerVisualizzaRivista {
	
	private RivistaDao rD;
	private Rivista R;
	private int tempIdMag;
	private static SystemState vis = SystemState.getIstance() ;
	
	public ControllerVisualizzaRivista()
	{
		rD = new RivistaDao();
	}
	public void setID(String i)
	{		
		tempIdMag = Integer.parseInt(i) ;
		vis.setId(tempIdMag);
	}
	public int getID()
	{
		Log.logger.log(Level.INFO,"{0}",vis.getId());
		return vis.getId();
	}
	public Rivista getData(int i) throws SQLException
	{
		// imposto che è un libro nel controller
		vis.setTypeAsMagazine();
		return  rD.getRivista(R,i);
		//return L;
	}
}
