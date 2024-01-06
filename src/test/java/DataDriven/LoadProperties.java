package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties 
{
	public static Properties userData = loadproperties(System.getProperty("user.dir")+"\\src\\main\\java\\Properties\\userData.properties");
	
	private static Properties loadproperties(String path)
	{
		Properties pro = new Properties();
		
		FileInputStream stream;
		try 
		{
			stream = new FileInputStream(path);
			pro.load(stream);
		} catch (FileNotFoundException e) 
			{
			System.out.println("Error Occuored====>"+e.getMessage());
			} catch (IOException e) 
				{
						System.out.println("Error Occuored====>"+e.getMessage());
				}
		return pro;
		
		
	}
	

}
