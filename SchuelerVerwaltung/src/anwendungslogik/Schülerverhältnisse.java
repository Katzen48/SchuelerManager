package anwendungslogik;

public class Schülerverhältnisse
{
	private AllgemeinbildendeSchule schule = new AllgemeinbildendeSchule();


	public AllgemeinbildendeSchule getAllgemeinbildendeSchule()
	{
		return schule;
	}
	public void setAllgemeinbildeneSchule(AllgemeinbildendeSchule pSchule)
	{
		this.schule = pSchule;
	}
	public void ausgeben()
	{
		System.out.println("Schülerverhältnisse: Auch hier musst du dich in geduld üben");
	}
}
