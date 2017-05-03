
package allgemeinedaten;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import anwendungslogik.Geschlecht;
import datenbank.Datenbankverbindung;

public class AngabenZurPerson
{
private SchülerInID schülerInID;
private String vorname;
private String nachname;
private LocalDate geburtsDatum;
private Geschlecht geschlecht;



public AngabenZurPerson(String pVorname , String pNachname , LocalDate pGeburtsdatum, Geschlecht pGeschlecht)
{
	super();
	this.schülerInID=new SchülerInID();
	this.vorname=pVorname;
	this.nachname=pNachname;
	this.geburtsDatum=pGeburtsdatum;
	this.geschlecht=pGeschlecht;
}

public AngabenZurPerson(String pVorname, String pNachname)
{
	super();
	this.vorname=pVorname;
	this.nachname=pNachname;

}
 /** 
 * Ausgabe von Angaben zur Kontrolle für FX
 */

 public void ausgeben()
 {
   System.out.println("Vorname:   "+getVorname());
   System.out.println("Nachname:   "+getNachname());
   System.out.println("Geburtsdatum:   "+getGeburtsDatum());
   System.out.println("Geschlecht:	"+getGeschlecht());
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

public void ausgebenKonsoleTest()
{
	System.out.println("Name: " + vorname + " " + nachname);
	System.out.println("Geburtsdatum: " + getGeburtsDatum() );
	System.out.println("Geschlecht: " + geschlecht);
}

public void anlegenAngabenZurPerson()
{
   speichernDB(vorname , nachname , geburtsDatum, geschlecht);
}

//Datenbankmethoden
public void speichernDB(String pVorname , String pNachname , LocalDate pGeburtsdatum, Geschlecht pGeschlecht)
{
  Connection lConnection = Datenbankverbindung.holen();
  Statement lBefehl;



  try {
	lBefehl = lConnection.createStatement();
	lBefehl.execute("INSERT INTO schülerin(SchülerInID,Vorname,Nachname,GbDatum,Geschlecht) VALUES("+schülerInID.getID()+","+pVorname+","+pNachname+","+pGeburtsdatum+","+pGeschlecht+")");

  } catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

public int suchenSchülerInID()
{
	Connection lConnection = Datenbankverbindung.holen();
	Statement lBefehl;



	try {
		lBefehl = lConnection.createStatement();
		ResultSet result= lBefehl.executeQuery("SELECT IDSchüler FROM schüler WHERE Vorname='"+vorname+"'AND Nachname='"+nachname+"'");
		result.first();
		int lSchülerID =result.getInt(1);
		System.out.println(lSchülerID);
		return lSchülerID;




	}

	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		int z=-1;
		return z;

	}
}

// getter und setter
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