package anwendungslogik;

public class Herkunft
{
private String staatsangehörigkeit;
private String volksgruppe;
private String geburtsort;
private String geburtsland;

/**
 * Ausgabe von Angaben zur Kontrolle für JavaFx
 */
	public void ausgeben()
	{
		System.out.println("Staatsangehörigkeit:"+getStaatsangehörigkeit());
		System.out.println("Volksgruppe"+getVolksgruppe());
		System.out.println("Geburtsort:"+getGeburtsort());
		System.out.println("Geburtsland:"+getGeburtsland());
	}

public String getStaatsangehörigkeit()
{

	return staatsangehörigkeit;
}
public void setstaatsangehörigkeit(String pStaatsangehörigkeit)
{

	this.staatsangehörigkeit = pStaatsangehörigkeit;
}
public String getVolksgruppe()
{
	return volksgruppe;
}
public void setVolksgruppe(String pVolksgruppe)
{
	this.volksgruppe = pVolksgruppe;
}
public String getGeburtsort()
{
	return geburtsort;
}
public void setGeburtsort(String pGeburtsort)
{
	this.geburtsort = pGeburtsort;
}
public String getGeburtsland()
{
	return geburtsland;
}
public void setGeburtsland(String pGeburtsland)
{
	this.geburtsland = pGeburtsland;
}



}
