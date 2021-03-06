package anwendungslogik;

import java.time.LocalDate;

public class AllgemeinbildendeSchule
{
	private LocalDate ausgeschiedenAm;
	private int ausgeschiedenAusJahrgang;
	private boolean sonderschule;
	private boolean hauptschule;
	private boolean realschule;
	private boolean sekundarschule;
	private boolean gesamtschule;
	private boolean gymnasium;
	private String nameDerSchule;
	private String bezirk;
	private String stadt;
	private String land;
	private String erreichterAbschluss;
	private String bemerkungen;

	/**
	 * Konstruktor ohne Parameter erstellt ein leeres Objekt
	 */
	public AllgemeinbildendeSchule() {}

	/**
	 * Konstruktor
	 * @param pAusgeschiedenAm
	 * @param pAusgeschiedenAusJahrgang
	 * @param pSonderschule
	 * @param pHauptschule
	 * @param pRealschule
	 * @param pSekundarschule
	 * @param pGesamtschule
	 * @param pGymnasium
	 * @param pNameDerSchule
	 * @param pBezirk
	 * @param pStadt
	 * @param pLand
	 * @param pErreichterAbschluss
	 * @param pBemerkung
	 */
	public AllgemeinbildendeSchule(LocalDate pAusgeschiedenAm, int pAusgeschiedenAusJahrgang, boolean pSonderschule, boolean pHauptschule, boolean pRealschule,boolean pSekundarschule, boolean pGesamtschule, boolean pGymnasium, String pNameDerSchule, String pBezirk, String pStadt, String pLand, String pErreichterAbschluss, String pBemerkung)
	{
			this.ausgeschiedenAm = pAusgeschiedenAm;
			this.ausgeschiedenAusJahrgang = pAusgeschiedenAusJahrgang;
			this.sonderschule = pSonderschule;
			this.hauptschule = pHauptschule;
			this.realschule = pRealschule;
			this.sekundarschule = pSekundarschule;
			this.gesamtschule = pGesamtschule;
			this.gymnasium = pGymnasium;
			this.nameDerSchule = pNameDerSchule;
			this.bezirk = pBezirk;
			this.stadt = pStadt;
			this.land = pLand;
			this.erreichterAbschluss = pErreichterAbschluss;
			this.bemerkungen = pBemerkung;
	}
	public void anlegenAllgemeinbildendeSchule()
	{
	}
	public void aendernAllgemeinbildendeSchule()
	{
	}
	public void loeschenAllgemeinbildendeSchule()
	{
	}
	public void ausgeben()
	{
		System.out.println(ausgeschiedenAm.toString());
		System.out.println(ausgeschiedenAusJahrgang);
		System.out.println(sonderschule);
		System.out.println(hauptschule);
		System.out.println(realschule);
		System.out.println(sekundarschule);
		System.out.println(gesamtschule);
		System.out.println(gymnasium);
		System.out.println(nameDerSchule);
		System.out.println(bezirk);
		System.out.println(stadt);
		System.out.println(land);
		System.out.println(erreichterAbschluss);
		System.out.println(bemerkungen);
	}
	public LocalDate getAusgeschiedenAm()
	{
		return ausgeschiedenAm;
	}
	public void setAusgeschiedenAm(LocalDate pDatum)
	{
		this.ausgeschiedenAm = pDatum;
	}
	public int getAusgeschiedenAusJahrgang()
	{
		return ausgeschiedenAusJahrgang;
	}
	public void setAusgeschiedenAusJahrgang(int pJahr)
	{
		this.ausgeschiedenAusJahrgang = pJahr;
	}
	public boolean isSonderschule()
	{
		return sonderschule;
	}
	public void setSonderschule(boolean pSonderschule)
	{
		this.sonderschule = pSonderschule;
	}
	public boolean isHauptschule()
	{
		return hauptschule;
	}
	public void setHauptschule(boolean pHauptschule)
	{
		this.hauptschule = pHauptschule;
	}
	public boolean isRealschule()
	{
		return realschule;
	}
	public void setRealschule(boolean pRealschule)
	{
		this.realschule = pRealschule;
	}
	public boolean isSekundarschule()
	{
		return sekundarschule;
	}
	public void setSekundarschule(boolean pSekundarschule)
	{
		this.sekundarschule = pSekundarschule;
	}
	public boolean isGesamtschule()
	{
		return gesamtschule;
	}
	public void setGesamtschule(boolean pGesamtschule)
	{
		this.gesamtschule = pGesamtschule;
	}
	public boolean isGymnasium()
	{
		return gymnasium;
	}
	public void setGymnasium(boolean pGymnasium)
	{
		this.gymnasium = pGymnasium;
	}
	public String getNameDerSchule()
	{
		return nameDerSchule;
	}
	public void setNameDerSchule(String pNameDerSchule)
	{
		this.nameDerSchule = pNameDerSchule;
	}
	public String getErreichterAbschluss()
	{
		return erreichterAbschluss;
	}
	public void setErreichterAbschluss(String pErreichterAbschluss)
	{
		this.erreichterAbschluss = pErreichterAbschluss;
	}
	public String getBemerkungen()
	{
		return bemerkungen;
	}
	public void setBemerkungen(String pBemerkungen)
	{
		this.bemerkungen = pBemerkungen;
	}
	public String getBezirk()
	{
		return bezirk;
	}
	public void setBezirk(String pBezirk)
	{
		this.bezirk = pBezirk;
	}
	public String getStadt()
	{
		return stadt;
	}
	public void setStadt(String pStadt)
	{
		this.stadt = pStadt;
	}
	public String getLand()
	{
		return land;
	}
	public void setLand(String pLand)
	{
		this.land = pLand;
	}
}
