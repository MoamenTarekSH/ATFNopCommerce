package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PagesObjects.HomePage;
import PagesObjects.SearchPage;

public class SearchTest extends TestBase {

	HomePage  homepageObject;
	SearchPage searchObject;
	String Item = "camera";

	@Test
	public void TestSearch()
	{
		searchObject = new SearchPage(driver);
		searchObject.SearchInput(Item);
		//Assert.assertTrue(searchObject.Search_Result.getText().equalsIgnoreCase("Add to cart"));
		//System.out.println(searchObject.SearchItemDetails());
	}
	
	
}
