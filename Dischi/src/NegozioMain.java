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
		disk.add(new ShowName("Album A"));
		disk.add(new ShowName("Album B"));
		disk.add(new ShowName("Album C"));
		disk.add(new ShowName("Album D"));
		disk.add(new ShowName("Album E"));
		disk.add(new ShowName("Album F"));
		disk.add(new ShowName("Album G"));
		disk.add(new ShowName("Album H"));
		disk.add(new ShowName("Album I"));
		disk.add(new ShowName("Album J"));
		disk.add(new ShowName("Album K"));
		disk.add(new ShowName("Album L"));
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
			ShowYear aryear[] = new ShowYear[year.size()];
			aryear=year.toArray(aryear);
			ShowName ardisk[]= new ShowName[disk.size()];
			ardisk=disk.toArray(ardisk);
			List<ShowYear> outputyear= Arrays.asList(aryear);
			List<ShowName> outputname= Arrays.asList(ardisk);
			int c;
			System.out.println("Premi 1 per visualizzare i dischi, premi 2 per inserirli, 4 per effettuare una ricerca nel Database");
			System.out.print("Input: ");
			Scanner input= new Scanner(System.in);
			c=input.nextInt();
			if (c==1)
			{
				int cc;
				System.out.println("Visualizzare gli album in ordine alfabetico [1] o in ordine di data[2]?");
				System.out.println("Premere qualsiasi altro numero per visualizzare i dischi in modo non ordinato");
				System.out.print("Input: ");
				Scanner sc=new Scanner (System.in);
				cc=sc.nextInt();
				System.out.println("*****--OUTPUT DEI DISCHI--*****");
				for (int i=0;i<disk.size();i++)
				{
					if (cc==1)
					{
						ShowName ntemp;
						for (int us=0;us<ardisk.length-1;us++)
						{
							for (int q=0;q<ardisk.length-us-1;q++)
							{
								if (ShowName.showNameCompare(ardisk[q], ardisk[q+1])<0)
								{
									ntemp = ardisk[q];
				                    ardisk[q] = ardisk[q+1];
				                    ardisk[q+1] = ntemp;
								}
							}
						}
					}
					if (cc==2)
					{
						ShowYear ytemp;
						for (int pl=0; pl<aryear.length-1;pl++)
						{
						   for(int y=0;y<aryear.length-pl-1;y++)
						   {
						            if(ShowYear.showYearCompare(aryear[y], aryear[y+1])<0)
						            {
						                   ytemp = aryear [y];
						                   aryear [y]= aryear [y+1];
						                   aryear [y+1] = ytemp;						                  
						            }
						   }
						}
					}
					outputname.get(i).PrintName();
	                outputyear.get(i).PrintYear();
				}
			}
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