import java.util.*;
public class NegozioMain {

	public static void main(String[] args) 
	{
		ArrayList<ShowName> disk = new ArrayList <ShowName>();
		ArrayList<ShowYear> year = new ArrayList <ShowYear>();
		disk.add(new ShowName("Album 1"));
		disk.add(new ShowName("Album 2"));
		disk.add(new ShowName("Album 3"));
		disk.add(new ShowName("Album 4"));
		disk.add(new ShowName("Album 5"));
		disk.add(new ShowName("Album 6"));
		disk.add(new ShowName("Album 7"));
		disk.add(new ShowName("Album 8"));
		disk.add(new ShowName("Album 9"));
		disk.add(new ShowName("Album 10"));
		disk.add(new ShowName("Album 11"));
		disk.add(new ShowName("Album 12"));
		year.add(new ShowYear (1978));
		year.add(new ShowYear (1958));
		year.add(new ShowYear (2008));
		year.add(new ShowYear (1981));
		year.add(new ShowYear (1948));
		year.add(new ShowYear (1962));
		year.add(new ShowYear (1990));
		year.add(new ShowYear (1995));
		year.add(new ShowYear (1999));
		year.add(new ShowYear (2003));
		year.add(new ShowYear (2016));
		year.add(new ShowYear (2017));
		//for (int i=0, i<disco)
		for (int i=0;i<disk.size();i++)// OUTPUT
		{
			disk.get(i).PrintName();
			year.get(i).PrintYear();
		}
	}

}