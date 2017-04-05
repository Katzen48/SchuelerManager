package lehrmittel;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;

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
	     stmt.execute("INSERT INTO lehrmittel VALUES ("+this.getLehrmittelID()+", '"+this.getFach()+"', '"+this.getArt()+"', '"+this.getName()+"', '"+this.getAusgegeben().toString()+"', "+this.isRückgabe()+"," +pSchülerID + ")");


	} catch (Exception ex) {
	    System.out.println("Fehler bei der Verarbeitung + " + "Lehrmittel" + "n" + ex.getMessage());
	}
}

public String getFach() {
	return fach;
}

public void setFach(String fach) {
	this.fach = fach;
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
