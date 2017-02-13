package anwendungslogik;

public class Sch�lerIn
{
private Sch�lerID sch�lerInID = new Sch�lerID();
private AngabenZurPerson person = new AngabenZurPerson();
private Sprachen sprachen = new Sprachen();
private Kontaktdaten kontaktSch�ler = new Kontaktdaten();
private Kontaktdaten kontaktVater = new Kontaktdaten();
private Kontaktdaten kontaktMutter = new Kontaktdaten();
private Kontaktdaten kontaktAndere = new Kontaktdaten();
private Sch�lerverh�ltnisse sch�lerverh�ltnisse = new Sch�lerverh�ltnisse();
private Herkunft herkunft = new Herkunft();
private ErziehungsberechtigteR vormund = new ErziehungsberechtigteR();
private BeruflicheBildungVorbereitungBef�higung beruficheVorbereitung = new BeruflicheBildungVorbereitungBef�higung();
private AllgemeinbildendeSchule aktuelleSchule = new AllgemeinbildendeSchule();
private Adresse adresse = new Adresse();

public AngabenZurPerson getPerson()
{
	return person;
}
public void setPerson(AngabenZurPerson pPerson)
{
	this.person = pPerson;
}
public Sprachen getSprachen()
{
	return sprachen;
}
public void setSprachen(Sprachen pSprachen)
{
	this.sprachen = pSprachen;
}
public Kontaktdaten getKontaktsch�ler()
{
	return kontaktSch�ler;
}
public void setKontaktsch�ler(Kontaktdaten pKontaktsch�ler)
{
	this.kontaktSch�ler = pKontaktsch�ler;
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
public Sch�lerverh�ltnisse getSch�lerverhalten()
{
	return sch�lerverh�ltnisse;
}
public void setSch�lerverhalten(Sch�lerverh�ltnisse pSch�lerverhalten)
{
	this.sch�lerverh�ltnisse = pSch�lerverhalten;
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
public BeruflicheBildungVorbereitungBef�higung getBerufichevorbereitung()
{
	return beruficheVorbereitung;
}
public void setBerufichevorbereitung(BeruflicheBildungVorbereitungBef�higung pBerufichevorbereitung)
{
	this.beruficheVorbereitung = pBerufichevorbereitung;
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
public Sch�lerID getSch�lerInID()
{
	return sch�lerInID;
}
public void setSch�lerID(Sch�lerID pSch�lerID)
{
	this.sch�lerInID = pSch�lerID;
}

}

