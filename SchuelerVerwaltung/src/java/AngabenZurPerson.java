package java;

import java.time.LocalDate;

public class AngabenZurPerson
{
private String vorname;
private String nachname;
private LocalDate geburtsDatum;
private Geschlecht geschlecht;

/** legt Angaben zur Person an
 *
 */
public void anlegenAngabenZurPerson()
{

}
/** aendert Angaben zur Person
 *
 */
public void aendernAngabenZurPerson()
{

}
/** loescht Angaben zur Person
 *
 */
public void loeschenAngabenZurPerson()
{

}
/** speichert Angaben zur Person
 *
 */
public void speichernAngabenZurPerson()
{

}











public String getVorname()
{
	return vorname;
}


public void setVorname(String pVorname)
{
	this.vorname = pVorname;
}


public String getNachname()
{
	return nachname;
}


public void setNachname(String pNachname)
{
	this.nachname = pNachname;
}


public LocalDate getGeburtsDatum()
{
	return geburtsDatum;
}


public void setGeburtsDatum(LocalDate pGeburtsDatum)
{
	this.geburtsDatum = pGeburtsDatum;
}


public Geschlecht getGeschlecht()
{
	return geschlecht;
}


public void setGeschlecht(Geschlecht pGeschlecht)
{
	this.geschlecht = pGeschlecht;
}


}