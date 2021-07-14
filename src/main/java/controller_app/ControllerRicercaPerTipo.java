package controller_app;

public class ControllerRicercaPerTipo {

	private SystemState vis=SystemState.getIstance();
	
	public ControllerRicercaPerTipo() 
	{
		//singeltonSystemState vis=singeltonSystemState.getIstance();

	}
	
	public boolean setRicercaL()
	{
		
		if (vis.getType().equals("libro"))
			return true;
		else
			return false;
	}
	public boolean setRicercaG()
	{
		SystemState.getIstance().setTypeAsDaily();
		if (SystemState.getIstance().getType().equals("giornale"))
			return true;
		else
			return false;
	}
	public boolean setRicercaR()
	{
		SystemState.getIstance().setTypeAsMagazine();
		if (SystemState.getIstance().getType().equals("rivista"))
			return true;
		else
			return false;
	}
}
