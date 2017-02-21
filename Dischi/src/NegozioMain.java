import java.util.*;
public class NegozioMain {
 	@SuppressWarnings({ "resource" })
	public static void main(String[] args) 
	{
		SearchDiskByName dname= new SearchDiskByName();
		SearchDiskByYear dyear= new SearchDiskByYear();
		ArrayList<ShowName> disk = new ArrayList <ShowName>();
		ArrayList<ShowYear> year = new ArrayList <ShowYear>();
		int repeat;
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
		do
		{
			dname.setdisklist(disk);
			dyear.setyeardisklist(year);
			int c;
			System.out.println("Premi 1 per visualizzare i dischi, premi 2 per inserirli, 4 per effettuare una ricerca nel Database");
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
				for (int i=0; i<num; i++)
					{
					System.out.print("Inserisci il nome del disco " +(i+1)+ ": ");
					Scanner input3 =new Scanner (System.in);
					String nomealbum=input3.nextLine();
					disk.add(new ShowName(nomealbum));
					System.out.print("Inserisci l'anno di pulicazione dell'album: ");
					Scanner input4=new Scanner (System.in);
					int annopubblicazione=input4.nextInt();
					year.add(new ShowYear(annopubblicazione));
					}
			//break;
		//}
			}
			if (c==4)
			{
				System.out.println("Premi 6 per effettuare una ricerca mediante nome, 7 per effettuare una ricerca mediante data");
				System.out.print("Input: ");
				Scanner searchinput=new Scanner (System.in);
				int ab;
				ab=searchinput.nextInt();
				if (ab==6)
				{
					String NameSearchKey;
					System.out.print("Digita la chiave di ricerca: ");
					Scanner namesearchinput= new Scanner (System.in);
					NameSearchKey=namesearchinput.nextLine();
					if (dname.ricerca(NameSearchKey) == true)
					{
						System.out.println("Elemento presente nella lista!");
					}
					else
					{
						System.out.println("Elemento NON presente nella lista!");
					}
					}
					if (ab==7)
					{
					int YearSearchKey;
					System.out.print("Digita la chiave di ricerca: ");
					Scanner yearsearchinput= new Scanner (System.in);
					YearSearchKey=yearsearchinput.nextInt();
					if (dyear.search(YearSearchKey) == true)
					{
						System.out.println("Elemento presente nella lista!");
					}
					else
					{
						System.out.println("Elemento non presente nella lista!");
					}
					}
			}
				System.out.print("Premi 3 per ripetere il programma, oppure premi un qualsiasi altro tasto per uscire: ");
				Scanner repeater= new Scanner (System.in);
				repeat=repeater.nextInt();
			}
		while (repeat==3);
	}
}