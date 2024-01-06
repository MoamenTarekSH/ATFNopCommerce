package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PagesObjects.HomePage;
import PagesObjects.SearchPage;

public class ChangeCurrencyTest extends TestBase{
	
	SearchPage searchObject;
	HomePage homeObject;
	String Item = "htc";
	

	
	@Test(priority = 0)
	public void TestSearch()
	{
		homeObject = new HomePage(driver);
		
		searchObject = new SearchPage(driver);
		searchObject.SearchInput(Item);
		//Assert.assertTrue(searchObject.Search_Result.getText().equalsIgnoreCase("Add to cart"));
		
		//System.out.println(searchObject.SearchItemDetails());
	}
	
	@Test(priority = 1)
	public void TestChangeCurrency() throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.ChangeCurrency();
		Thread.sleep(3000);
		Assert.assertTrue(searchObject.Currency_Sign.getText().contains("€"));
	}

}
