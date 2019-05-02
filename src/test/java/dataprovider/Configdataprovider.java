package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configdataprovider {
	
	 Properties pro ;
	
	 
	public Configdataprovider()
	{   
		File src = new File("./configurations/config.properties");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			 
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) 
		
		{
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	   public String chromePath()
	   {   
		   String url = pro.getProperty("chromepath");
		   return url;
		   
	   }
	
	
	public  String getApplicationUrl()
		{
			
		String url = pro.getProperty("url");
		return url;
			
		}
		
	}


