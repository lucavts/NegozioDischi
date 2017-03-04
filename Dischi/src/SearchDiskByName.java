import java.util.ArrayList;
public class SearchDiskByName {
	private ArrayList <ShowName> disklist;
	public SearchDiskByName() {
		this.disklist=new ArrayList<ShowName>(); //CREAZIONE NUOVO ARRAY DINAMICO (LA DIMENSIONE VARIA IN BASE AL NUMERO DEGLI ELEMENTI) DI TIPO SHOWNAME
	}
	public boolean ricerca (String esito) //INIZIO METODO DI RICERCA PER NOME
	{
		for (int i=0; i<this.disklist.size(); i++)
		{
			if (esito.equals(this.disklist.get(i).getDisco())) //SE LA STRINGA DIGITATA SI TROVA IN UN ELEMENTO DI DISKLIST
			{
				return true; //RITORNA IL VALORE VERO
			}
		}
		return false; // RITORNA FALSO
	}
	public void setdisklist(ArrayList<ShowName> disk) //DICHIARAZIONE ARRAYLIST PER RICERCA TRAMITE NOME
	{
		for (int i=0; i<disk.size(); i++)
		{
			this.disklist.add(disk.get(i));
		}
	}
	public ArrayList<ShowName> getdisklist() //METODO PER OTTENERE DISKLIST
	{
		return disklist;
	}
}