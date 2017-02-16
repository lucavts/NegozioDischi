import java.util.*;
@SuppressWarnings("unused")
public class ShowYear {
	Integer pubyear;
	public ShowYear(Integer pubyear) {
		this.pubyear=pubyear;
	}
	public void PrintYear()
	{
		System.out.println("Data di uscita dell'album: "+this.pubyear);
	}
}