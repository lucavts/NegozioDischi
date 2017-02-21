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
}
