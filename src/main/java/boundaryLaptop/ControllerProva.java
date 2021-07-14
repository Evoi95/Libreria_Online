package boundaryLaptop;

public class ControllerProva {
	
	public int controlla(String a,String b)
	{
		if(a.compareTo(b)==0)
		{
			System.out.println("Stringhe uguali");
			return 0 ;
		}
		
		else 
			{	
				System.out.println("Stringhe diverse");

				return 1;
			}
	}

}
