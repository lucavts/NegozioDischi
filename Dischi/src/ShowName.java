import java.util.*;
@SuppressWarnings("unused")
public class ShowName {
	String disco;
	public ShowName(String showName) {
		this.disco =showName;
	}
	public void PrintName()
	{
		System.out.println("Nome disco: "+this.disco);
	}
	public String getDisco()
	{
		return this.disco;
	}
	public void setDisco(String disco)
	{
		this.disco=disco;
	}
	 	public static int showNameCompare(ShowName NAr1, ShowName NAr2)
	{
		String f1=NAr1.getDisco();
		String f2=NAr2.getDisco();
		if(f1.compareTo(f2) > 0)
		{
			return -1;
		}
		else
		{
			if(f1.compareTo(f2)== 0)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
	}
} 
