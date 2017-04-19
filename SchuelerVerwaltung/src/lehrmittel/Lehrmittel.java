package lehrmittel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import anwendungslogik.SchülerID;
import datenbank.Datenbankverbindung;

public class Lehrmittel {
private	String fach;
private	String art;
private	String name;
private LocalDate ausgegeben;
private boolean rückgabe;
private	int lehrmittelID;

	/**
	 * Konstruktor ohne Parameter erstellt ein leeres Objekt
	 */
public Lehrmittel()
{

}

/**
 * Konstruktor mit Parametern zur verarbeitung von Daten
 * @param pFach
 * @param pArt
 * @param pName
 * @param pAusgegeben
 * @param pRückgabe
 */
public Lehrmittel(String pFach, String pArt, String pName, LocalDate pAusgegeben, boolean pRückgabe)
{
	this.fach = pFach;
	this.art = pArt;
	this.name = pName;
	this.ausgegeben = pAusgegeben;
	this.rückgabe = pRückgabe;
}
/**
 * Lehrmittel anlegen
 */
public void anlegen()
{

}
/**
 * Lehrmittel speichern
 */
public void speichern(SchülerID pSchülerID)
{
	Connection lConnection = Datenbankverbindung.holen();

	Statement stmt = null;

	try {
	     stmt = lConnection.createStatement();
	     stmt.execute("INSERT INTO Lernmittel VALUES ("+this.getLehrmittelID()+", '"+this.getArt()+"', '"+this.getFach()+"', '"+this.getName()+"', '"+this.getAusgegeben().toString()+"', "+this.isRückgabe()+")");


	} catch (Exception ex) {
	    System.out.println("Fehler bei der Verarbeitung + " + "Lehrmittel" + " " + ex.getMessage());
	}
}

public static Lehrmittel[] holen(SchülerID pID) {
	ArrayList<Lehrmittel> lArraylist = new ArrayList<Lehrmittel>();
	Connection lConnection = Datenbankverbindung.holen();

	Statement stmt = null;
	ResultSet result = null;
  try {
     stmt = lConnection.createStatement();
     result = stmt.executeQuery("SELECT * FROM Lernmittel l, ausgeliehen a WHERE l.IDLernm = a.IDLernm AND IDSchüler = '" + pID.getSchülerID() + "'" /* + pID.getSchülerID() */ /* + lWhere  + " WHERE " + lWhere */);
     result.first();  //Zeigt auf den ersten Datensatz in result

     while(! result.isAfterLast()) { // as long as valid data is in the result set

       lArraylist.add(new Lehrmittel(result.getString("Fach"), result.getString("Art"), result.getString("Name"), LocalDate.parse(result.getString("Datum")), result.getBoolean("Rückgabe")));
//       System.out.println(result.getDate(6));

       result.next(); // geht zum nächsten Datensatz in result

     }


} catch (Exception ex) {
    System.out.println("Fehler bei der Verarbeitung + " + "Lernmittel" + " " + ex.getMessage());

}

  return lArraylist.toArray(new Lehrmittel[lArraylist.size()]);

  }

public static Lehrmittel[] holenFürFach(String pFach)
{
	ArrayList<Lehrmittel> lArraylist = new ArrayList<Lehrmittel>();
	Statement stmt = null;
	ResultSet result = null;
	Connection lConnection = Datenbankverbindung.holen();
	try {
	     stmt = lConnection.createStatement();
	     result = stmt.executeQuery("SELECT * FROM Lernmittel l WHERE Fach = '" + pFach + "'");
	     result.first();  //Zeigt auf den ersten Datensatz in result

	     while(! result.isAfterLast()) { // as long as valid data is in the result set

	         lArraylist.add(new Lehrmittel(result.getString("Fach"), result.getString("Art"), result.getString("Name"), LocalDate.now(), false));

	         result.next(); // geht zum nächsten Datensatz in result
	       }
	}

    catch (Exception ex) {
        System.out.println("Fehler bei der Verarbeitung + " + "Lernmittel" + " " + ex.getMessage());
    }

	return lArraylist.toArray(new Lehrmittel[lArraylist.size()]);
}

public String getFach() {
	return fach;
}

public void setFach(String pFach) {
	this.fach = pFach;
}

public String getArt() {
	return art;
}

public void setArt(String art) {
	this.art = art;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getAusgegeben() {
	return ausgegeben;
}

public void setAusgegeben(LocalDate ausgegeben) {
	this.ausgegeben = ausgegeben;
}

public int getLehrmittelID() {
	return lehrmittelID;
}

public void setLehrmittelID(int lehrmittelID) {
	this.lehrmittelID = lehrmittelID;
}

public boolean isRückgabe() {
	return rückgabe;
}

public void setRückgabe(boolean rückgabe) {
	this.rückgabe = rückgabe;
}
}
