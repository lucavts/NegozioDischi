import java.util.ArrayList;
public class SearchDiskByYear {
	private ArrayList <ShowYear> yeardisklist; //CREAZIONE NUOVO ARRAY DINAMICO (LA DIMENSIONE VARIA IN BASE AL NUMERO DEGLI ELEMENTI) DI TIPO SHOWYEAR
	public SearchDiskByYear() {
		this.yeardisklist=new ArrayList<ShowYear>(); 
	}
	public boolean search (Integer esito_anno) //INIZIO METODO DI RICERCA PER ANNO
	{
		for (int i=0; i<this.yeardisklist.size(); i++)
			if (esito_anno.equals(this.yeardisklist.get(i).getpubyear())) //SE L'INTERO DIGITATO SI TROVA IN UN ELEMENTO DI YEARDISKLIST
			{
				return true; //RITORNA IL VALORE VERO
			}
		return false; //RITORNA IL VALORE FALSO
	}
	public void setyeardisklist(ArrayList<ShowYear> ars){ //DICHIARAZIONE ARRAYLIST PER RICERCA TRAMITE ANNO
		for (int i=0;i<ars.size();i++)
		{
			this.yeardisklist.add(ars.get(i));
		}
	}
	public ArrayList<ShowYear> getyeardisklist() //METODO PER OTTENERE YEARDISKLIST
	{
		return yeardisklist;
	}
}
