import java.util.ArrayList;
public class SearchDiskByYear {
	private ArrayList <ShowYear> yeardisklist;
	public SearchDiskByYear() {
		this.yeardisklist=new ArrayList<ShowYear>();
	}
	public boolean search (Integer esito_anno)
	{
		for (int i=0; i<this.yeardisklist.size(); i++)
			if (esito_anno.equals(this.yeardisklist.get(i).getpubyear()))
			{
				return true;
			}
		return false;
	}
	public void setyeardisklist(ArrayList<ShowYear> ars){
		for (int i=0;i<ars.size();i++)
		{
			this.yeardisklist.add(ars.get(i));
		}
	}
	public ArrayList<ShowYear> getyeardisklist()
	{
		return yeardisklist;
	}
}
