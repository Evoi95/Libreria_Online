package controller_app;

import java.sql.SQLException;
import java.util.logging.Level;

import database.*;
import factoryBook.*;
import javafx.collections.ObservableList;
import logger.Log;

public class ControllerRicercaPage {
	
	private LibroDao lD;
	private GiornaleDao gD;
	private RivistaDao rD;
	public ControllerRicercaPage()
	{
		lD = new LibroDao();
		gD = new GiornaleDao();
		rD =new RivistaDao();
		SystemState.getIstance().setIsSearch(true);
		Log.logger.log(Level.INFO,"vis nel costruttore {0}",SystemState.getIstance());
		
	}
	
	public ObservableList<Raccolta> cercaPerTipo (String S) throws SQLException
	{
		Log.logger.log(Level.INFO,"Tipo e confronto : {0}",SystemState.getIstance().getType().equals("libro"));
		if(SystemState.getIstance().getType().equals("libro"))
		{
			//serach in libro dao
			return lD.getLibriByName(S);
		}
		else if(SystemState.getIstance().getType().equals("giornale"))
		{
			//search in giornale dao
			return gD.getGiornaliByName(S);
		}
		else if(SystemState.getIstance().getType().equals("rivista"))
		{
			//search in rivista dao
			return rD.getRivisteByName(S);
		}
		
		return null;
		
	}
	
	public String returnType()
	{
		return SystemState.getIstance().getType();
	}
	
	
}
