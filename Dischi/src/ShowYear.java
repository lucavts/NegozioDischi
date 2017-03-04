	public class ShowYear {
	Integer pubyear;
	public ShowYear(Integer pubyear) {
		this.pubyear=pubyear;
	}
	public void PrintYear() //METODO PER L'OUTPUT DELLA DATA DI USCITA DELL'ALBUM
	{
		System.out.println("Data di uscita dell'album: "+this.pubyear);
	}
	public Integer getpubyear() //METODO PER OTTENERE LA DATA DI USCITA NELLA MAIN
	{
		return this.pubyear;
	}
	public void setpubyear (Integer pubyear)
			{
				this.pubyear=pubyear;
			}
		public static int showYearCompare(ShowYear YAr1, ShowYear YAr2) //METODO PER ORDINARE I DISCHI PER DATA
	{
		int i1=YAr1.getpubyear();
		int i2=YAr2.getpubyear();
		if(i1>i2) 
		{
			return -1;
		}
		else
		{
			if(i1==i2)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
	}
}