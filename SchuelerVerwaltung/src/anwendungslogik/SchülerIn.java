package anwendungslogik;

import Sprache.sprechen;
import adresse.Adresse;
import allgemeinedaten.AngabenZurPerson;
import kontaktdaten.Kontaktdaten;
import lehrmittel.AusgeliehenLehrmittel;

public class SchülerIn
{
private SchülerID schülerInID;
private AngabenZurPerson person;
private sprechen sprechen;
private Kontaktdaten kontaktSchüler;
private Kontaktdaten kontaktVater;
private Kontaktdaten kontaktMutter;
private Kontaktdaten kontaktAndere;
private Schülerverhältnisse schülerverhältnisse;
private Herkunft herkunft;
private AusgeliehenLehrmittel[] ausgeliehenlehrmittel;
private ErziehungsberechtigteR vormund;
private BeruflicheBildungVorbereitungBefähigung beruflicheVorbereitung;
private AllgemeinbildendeSchule aktuelleSchule;
private Adresse adresse;

/**
 * Konstrukter erstellt ein leeres Objekt
 */

public SchülerIn()
{
	this.schülerInID = new SchülerID();
}

/**
 * Konstruktor mit Parametern erstelt neues Objekt, weist Attributen Objekten zu.
 * @param pSchülerID
 * @param pPerson
 * @param pSprachen
 * @param pKontaktSchüler
 * @param pKontaktVater
 * @param pKontaktMutter
 * @param pKontaktAndere
 * @param pSchülerverhältnisse
 * @param pHerkunft
 * @param pAusgeliehenLehrmittel
 * @param pVormund
 * @param pBeruflichVorbereitung
 * @param pAktuelleSchule
 * @param pAdresse
 *
 */

public SchülerIn(SchülerID pSchülerID, AngabenZurPerson pPerson, Sprachkompetenz pSprachen, Kontaktdaten pKontaktSchüler, Kontaktdaten pKontaktVater,Kontaktdaten pKontaktMutter,Kontaktdaten pKontaktAndere, Schülerverhältnisse pSchülerverhältnisse, Herkunft pHerkunft, AusgeliehenLehrmittel[] pAusgeliehenLehrmittel,ErziehungsberechtigteR pVormund,BeruflicheBildungVorbereitungBefähigung pBeruflicheVorbereitung, AllgemeinbildendeSchule pAktuelleSchule,Adresse pAdresse)
{

	this.person = pPerson;
	this.sprachkompetenz = pSprachen;
	this.kontaktSchüler = pKontaktSchüler;
	this.kontaktVater = pKontaktVater;
	this.kontaktMutter = pKontaktMutter;
	this.kontaktAndere = pKontaktAndere;
	this.schülerverhältnisse = pSchülerverhältnisse;
	this.herkunft = pHerkunft;
	this.ausgeliehenlehrmittel = pAusgeliehenLehrmittel;
	this.vormund = pVormund;
	this.beruflicheVorbereitung = pBeruflicheVorbereitung;
	this.aktuelleSchule = pAktuelleSchule;
	this.adresse = pAdresse;
}
/**
 * Gibt Objekt aus
 */
public void ausgeben()
{
adresse.ausgeben();
//person.ausgeben();
//sprachen.ausgeben();
//kontaktSchüler.ausgeben();
//kontaktVater.ausgeben();
//kontaktMutter.ausgeben();
//kontaktAndere.ausgeben();
//schülerverhältnisse.ausgeben();
//herkunft.ausgeben();
//vormund.ausgeben();
//beruflicheVorbereitung.ausgeben();
aktuelleSchule.ausgeben();
}
/**
 * speichern schülerIn
 */
public void speichern()
{
	speichernAusgelieheneLehrmittel();
	speichernsprechen();

}
/**
 * Speichert Lehrmittel zu einer bestimmten SchülerIn in der Datenbank.
 */
public void speichernAusgelieheneLehrmittel()
{

	for(AusgeliehenLehrmittel lAusgeliehenLehrmittel : ausgeliehenlehrmittel)
	{
		lAusgeliehenLehrmittel.speichern(getSchülerInID());
	}
}

public void speichernsprechen()
{
	sprechen.speichernDB();
}




public AngabenZurPerson getPerson()
{
	return person;
}
public void setPerson(AngabenZurPerson pPerson)
{
	this.person = pPerson;
}
public sprechen getSprachKompetenz()
{
	return sprechen;
}
public void setSprachKompetenz(sprechen pSprachen)
{
	this.sprechen = pSprachen;
}
public Kontaktdaten getKontaktschüler()
{
	return kontaktSchüler;
}
public void setKontaktschüler(Kontaktdaten pKontaktschüler)
{
	this.kontaktSchüler = pKontaktschüler;
}
public Kontaktdaten getKontaktvater()
{
	return kontaktVater;
}
public void setKontaktvater(Kontaktdaten pKontaktvater)
{
	this.kontaktVater = pKontaktvater;
}
public Kontaktdaten getKontaktmutter()
{
	return kontaktMutter;
}
public void setKontaktmutter(Kontaktdaten pKontaktmutter)
{
	this.kontaktMutter = pKontaktmutter;
}
public Kontaktdaten getKontaktandere()
{
	return kontaktAndere;
}
public void setKontaktandere(Kontaktdaten pKontaktandere)
{
	this.kontaktAndere = pKontaktandere;
}
public Schülerverhältnisse getSchülerverhalten()
{
	return schülerverhältnisse;
}
public void setSchülerverhalten(Schülerverhältnisse pSchülerverhalten)
{
	this.schülerverhältnisse = pSchülerverhalten;
}
public Herkunft getHerkunft()
{
	return herkunft;
}
public void setHerkunft(Herkunft pHerkunft)
{
	this.herkunft = pHerkunft;
}
public ErziehungsberechtigteR getVormund()
{
	return vormund;
}
public void setVormund(ErziehungsberechtigteR pVormund)
{
	this.vormund = pVormund;
}
public BeruflicheBildungVorbereitungBefähigung getBeruflichevorbereitung()
{
	return beruflicheVorbereitung;
}
public void setBerufichevorbereitung(BeruflicheBildungVorbereitungBefähigung pBeruflichevorbereitung)
{
	this.beruflicheVorbereitung = pBeruflichevorbereitung;
}
public AllgemeinbildendeSchule getAktuelleschule()
{
	return aktuelleSchule;
}
public void setAktuelleschule(AllgemeinbildendeSchule pAktuelleschule)
{
	this.aktuelleSchule = pAktuelleschule;
}
public Adresse getAdresse()
{
	return adresse;
}
public void setAdresse(Adresse pAdresse)
{
	this.adresse = pAdresse;
}
public SchülerID getSchülerInID()
{
	return schülerInID;
}
public void setSchülerID(SchülerID pSchülerID)
{
	this.schülerInID = pSchülerID;
}

public AusgeliehenLehrmittel[] getAusgeliehenlehrmittel()
{
	return ausgeliehenlehrmittel;
}

public void setAusgeliehenlehrmittel(AusgeliehenLehrmittel[] pAusgeliehenlehrmittel)
{
	this.ausgeliehenlehrmittel = pAusgeliehenlehrmittel;
}


}
