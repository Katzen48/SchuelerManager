/*
 * Jose 08.03.2017 angelegt
 */
package Sprache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Sprache.Sprachkompetenz;
import datenbank.Datenbankverbindung;
import javafx.collections.ObservableList;

public class Sprachkompetenz {
	SprachkompetenzID IDSprache;
	private Boolean sprachenName;
	private String sprachenNiveau;
	private Boolean sprachenDeutsch;
	private Boolean sprachenEnglisch;
	private Boolean sprachenTürkisch;
	private Boolean sprachenArabisch;
	private String sprachenSonstiges;
	/**
	 * Konstruktor mit Strings
	 * @param pSprachenName
	 * @param pSprachenNiveau
	 * @param pSprachkompetenzID
	 */
	public Sprachkompetenz(Boolean pSprachenName, String pSprachenNiveau, int SprachkompetenzIDWert, Boolean pSprachenDeutsch, Boolean pSprachenEnglisch, Boolean pSprachenTürkisch, Boolean pSprachenArabisch, String pSprachenSonstiges)
	{
		this.IDSprache = new SprachkompetenzID(SprachkompetenzIDWert);
		this.sprachenName = pSprachenName;
		this.sprachenNiveau = pSprachenNiveau;
		this.sprachenDeutsch = pSprachenDeutsch;
		this.sprachenEnglisch = pSprachenEnglisch;
		this.sprachenTürkisch = pSprachenTürkisch;
		this.sprachenArabisch = pSprachenArabisch;
		this.sprachenSonstiges = pSprachenSonstiges;
	}

	/** legt Sprachen an
	 *
	 */
	public void anlegenSprachen()
	{
		speichernDB();
	}
	/** aendert Sprachen
	 *
	 */
	public void aendernSprachen()
	{

	}
	/** loescht Angaben zur Person
	 *
	 */
	public void loeschenSprachen()
	{

	}
	/** speichert Sprachen
	 *
	 */
	public void speichernDB()
	{
		Connection lConnection = Datenbankverbindung.holen();
		  Statement lBefehl;
		  ResultSet lErgebnis;

		  try {
			lBefehl = lConnection.createStatement();
			lBefehl.execute("INSERT INTO sprache VALUES ( "+IDSprache.getID()+","+ sprachenNiveau+",\""+sprachenName+"\")");

		  } catch (SQLException e)
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	}
	 public static Sprachkompetenz auslesenDB(int SprachkompetenzIDWert)
	  {

	      Connection lConnection = Datenbankverbindung.holen();
		  Sprachkompetenz lSprachkompetenz;
		  ArrayList<Sprachkompetenz> lSprachkompetenzliste = new ArrayList<Sprachkompetenz>();
		  Statement lBefehl;
		  ResultSet lErgebnis;

		  try {
		  lBefehl = lConnection.createStatement();
		  lErgebnis = lBefehl.executeQuery("SELECT * FROM sprache where IDSprache="+ SprachkompetenzIDWert +";");
		  lErgebnis.first();  //Zeigt auf den ersten Datensatz in lErgebnis

		  while(! lErgebnis.isAfterLast())   //Solange das Ende nicht erreicht ist....
		     {
			   lSprachkompetenz = new Sprachkompetenz(lErgebnis.getBoolean(1),lErgebnis.getString(2),lErgebnis.getInt(3));
			   lSprachkompetenzliste.add(lSprachkompetenz);
			   //Spezial für dieses Beispiel springen wir gleich wieder raus.
	           // Sonst kann man hier eine Liste füllen.
			   return lSprachkompetenz;
		     }


		  	 } catch (Exception ex)
		  		{
		    System.out.println("Fehler bei der Verarbeitung: " + ex.getMessage());
		  		}
		  return null;
	  }

	public void ergänzen()
	{
	  Sprachkompetenz lSprachkompetenz = auslesenDB(this.IDSprache.getID());
	  sprachenName = lSprachkompetenz.sprachenName;
	  sprachenNiveau = lSprachkompetenz.sprachenNiveau;
	}
// Ab hier folgen nur Get/Set Methoden
	public Boolean getSprachenName()
	{
		return sprachenName;
	}
	public void setSprachenName(Boolean pSprachenName)
	{
		this.sprachenName = pSprachenName;
	}
	public String getSprachenNiveau()
	{
		return sprachenNiveau;
	}
	public void setSprachenNiveau(String pSprachenNiveau)
	{
		this.sprachenNiveau = pSprachenNiveau;
	}
	public SprachkompetenzID getSprachkompetenzID()
	{
		return IDSprache;
	}
	public void setSprachkompetenzID(SprachkompetenzID pSprachkompetenzID)
	{
		this.IDSprache = pSprachkompetenzID;
	}
	public Boolean getSprachenDeutsch()
	{
		return sprachenDeutsch;
	}
	public void setSprachenDeutsch(Boolean pSprachenDeutsch)
	{
		this.sprachenDeutsch = pSprachenDeutsch;
	}
	public Boolean getSprachenEnglisch()
	{
		return sprachenEnglisch;
	}
	public void setSprachenEnglisch(Boolean pSprachenEnglisch)
	{
		this.sprachenEnglisch = pSprachenEnglisch;
	}
	public Boolean getSprachenTürkisch()
	{
		return sprachenTürkisch;
	}
	public void setSprachenTürkisch(Boolean pSprachenTürkisch)
	{
		this.sprachenTürkisch = pSprachenTürkisch;
	}
	public Boolean getSprachenArabisch()
	{
		return sprachenArabisch;
	}
	public void setSprachenArabisch(Boolean pSprachenArabisch)
	{
		this.sprachenArabisch = pSprachenArabisch;
	}
	public String getSprachenSonstiges()
	{
		return sprachenSonstiges;
	}
	public void setSprachenSonstiges(String pSprachenSonstiges)
	{
		this.sprachenSonstiges = pSprachenSonstiges;
	}
}
