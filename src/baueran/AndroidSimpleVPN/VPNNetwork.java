package baueran.AndroidSimpleVPN;

import android.content.Context;

public abstract class VPNNetwork 
{
	private String name = null;
	private String type = null;
	private String server = null;
	private String domains = null;
	private String encUsername = null;
	private String encPassword = null;

	abstract public boolean isInDB(Context ctx);
	abstract public long write(Context ctx);
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}

	public void setServer(String server)
	{
		this.server = server;
	}

	public String getServer() 
	{
		return server;
	}

	public void setDomains(String domains)
	{
		this.domains = domains;
	}

	public String getDomains() 
	{
		return domains;
	}

	public void setEncUsername(String encUsername) 
	{
		this.encUsername = encUsername;
	}

	public String getEncUsername()
	{
		return encUsername;
	}

	public void setEncPassword(String encPassword)
	{
		this.encPassword = encPassword;
	}

	public String getEncPassword() 
	{
		return encPassword;
	}
}
