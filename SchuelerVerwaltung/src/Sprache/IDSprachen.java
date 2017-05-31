package Sprache;

public class IDSprachen {

	private int deutschID = 1;
	private int englischID = 2;
	private int türkischID = 3;
	private int arabischID = 4;
	private int sonstigesID = 5;
    public IDSprachen (int pDeutschID,int pEnglischID,int pTürkischID,int pArabischID,int pSonstigesID)
    {
    	this.deutschID = pDeutschID;
    	this.englischID = pEnglischID;
    	this.türkischID = pTürkischID;
    	this.arabischID = pArabischID;
    	this.sonstigesID = pSonstigesID;

	}
	public int getDeutschID()
	{
		return deutschID;
	}
	public void setDeutschID(int pDeutschID)
	{
		this.deutschID = pDeutschID;
	}
	public int getEnglischID()
	{
		return englischID;
	}
	public void setEnglischID(int pEnglischID)
	{
		this.englischID = pEnglischID;
	}
	public int getTürkischID()
	{
		return türkischID;
	}
	public void setTürkischID(int pTürkischID)
	{
		this.türkischID = pTürkischID;
	}
	public int getArabischID()
	{
		return arabischID;
	}
	public void setArabischID(int pArabischID)
	{
		this.arabischID = pArabischID;
	}
	public int getSonstigesID()
	{
		return sonstigesID;
	}
	public void setSonstigesID(int pSonstigesID)
	{
		this.sonstigesID = pSonstigesID;
	}


}