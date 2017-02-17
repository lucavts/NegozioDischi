import java.util.*;
public class NegozioMain {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) 
	{
		int c;
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
		System.out.println("Premi 1 per visualizzare i dischi, premi 2 per inserirli");
		System.out.print("Input: ");
		Scanner input= new Scanner(System.in);
		c=input.nextInt();
		//System.out.println(c);
		//switch (c)
		//{
		//for (int i=0, i<disco)
		//case '1':
		if (c==1)
		{
			for (int i=0;i<disk.size();i++)// OUTPUT
			{
				disk.get(i).PrintName();
				year.get(i).PrintYear();
			}
		}
			//break;
		//case '2':
		if (c==2)
		{
			System.out.print("Quanti dischi vuoi aggiungere? ");
			Scanner input2 = new Scanner (System.in);
			int num=input2.nextInt();
			int cont1=1;
			do
			{
				System.out.print("Indica il nome dell'album: ");
				Scanner inputalbum= new Scanner (System.in);		
				String namealbum=inputalbum.nextLine();
				System.out.print("Indica la data di uscita dell'album: ");
				Scanner inputdata= new Scanner (System.in);
				int yearalbum=inputdata.nextInt();
				disk.add(new ShowName(namealbum));
				year.add(new ShowYear (yearalbum));
				cont1++;
			}
			while (cont1==num);
			//break;
		//}
		}
		}
//BISOGNA INSERIRE UN METODO PER RICOMINCIARE GLI IF/SWITCH QUANDO CICLI CONCLUSI
}