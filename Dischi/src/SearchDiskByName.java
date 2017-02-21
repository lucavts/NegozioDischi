import java.util.ArrayList;
public class SearchDiskByName {
	private ArrayList <ShowName> disklist;
	public SearchDiskByName() {
		this.disklist=new ArrayList<ShowName>();
	}
	public boolean ricerca (String esito)
	{
		for (int i=0; i<this.disklist.size(); i++)
		{
			if (esito.equals(this.disklist.get(i).getDisco()))
			{
				return true;
			}
		}
		return false;
	}
	public void setdisklist(ArrayList<ShowName> disk)
	{
		for (int i=0; i<disk.size(); i++)
		{
			this.disklist.add(disk.get(i));
		}
	}
	public ArrayList<ShowName> getdisklist()
	{
		return disklist;
	}
}