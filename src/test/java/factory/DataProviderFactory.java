package factory;

import dataprovider.Configdataprovider;
import dataprovider.Excelfile;


public class DataProviderFactory {
	
	
	
	public static Configdataprovider getConfig()
	{ 
		
		Configdataprovider config=new Configdataprovider();
			return config;
		
		
	
		
	}
	
	public static Excelfile getexcel()
	{
		Excelfile excel = new Excelfile();
		return excel;
		
	}


}
