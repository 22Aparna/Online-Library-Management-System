package com.cg.librarymanagement.entities;

import javax.persistence.*;

@Entity
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adid")
	private int AdId;
	private String Adname;
	private String Ademail;
    private String Adpassword;
	
    public int getAdId() 
    {
		return AdId;
	}
	
    public void setAdId(int adId) 
    {
		AdId = adId;
	}
	
    public String getAdname()
    {
		return Adname;
	}
	
    public void setAdname(String adname)
    {
		Adname = adname;
	}
	
    public String getAdemail()
    {
		return Ademail;
	}
	
    public void setAdemail(String ademail) 
    {
		Ademail = ademail;
	}
	
    public String getAdpassword() 
    {
		return Adpassword;
	}
	
    public void setAdpassword(String adpassword)
    {
		Adpassword = adpassword;
	}
	
 }
