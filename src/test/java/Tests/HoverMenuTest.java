package Tests;

import org.testng.annotations.Test;

import PagesObjects.HomePage;

public class HoverMenuTest extends TestBase{
	HomePage homeObject ;
	
	@Test
	public void TestHoverComputersMenu()
	{
		homeObject = new HomePage(driver);
		homeObject.SelectNoteBook();
		//Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/notebooks"));
		//String URL = homeObject.getCurrentUrl();
		//System.out.println(URL);
	}
	
	

}
