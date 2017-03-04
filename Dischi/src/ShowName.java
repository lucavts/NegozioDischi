import java.util.*;
@SuppressWarnings("unused")
public class ShowName {
	String disco;
	public ShowName(String showName) {
		this.disco =showName;
	}
	public void PrintName()
	{
		System.out.println("Nome disco: "+this.disco); //METODO PER L'OUTPUT DEL NOME DEL DISCO
	}
	public String getDisco() //METODO PER OTTENERE IL DISCO NELLA MAIN
	{
		return this.disco;
	}
	public void setDisco(String disco)
	{
		this.disco=disco;
	}
	 	public static int showNameCompare(ShowName NAr1, ShowName NAr2) //METODO PER ORDINARE IL DISCO PER NOME
	{
		String f1=NAr1.getDisco(); 
		String f2=NAr2.getDisco();
		if(f1.compareTo(f2)>0) //SE F1 È MAGGIORE DI F2
		{
			return -1; //RITORNA IL VALORE -1
		}
		else
		{
			if(f1.compareTo(f2)==0) //SE F1 È UGUALE AD F2
			{
				return 0; //RITORNA IL VALORE 0
			}
			else //SE F1 È MINORE DI F2
			{
				return 1; //RITORNA IL VALORE 1
			}
		}
	}
} 
