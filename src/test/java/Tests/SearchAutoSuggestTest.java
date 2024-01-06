package Tests;

import org.testng.annotations.Test;

import PagesObjects.HomePage;
import PagesObjects.SearchPage;

public class SearchAutoSuggestTest extends TestBase {

	HomePage  homepageObject;
	SearchPage searchObject;
	String Item = "camera";


	
	
	@Test(priority = 0)
	public void TestSearchAutoSuggest() throws InterruptedException
	{

			searchObject = new SearchPage(driver);
			searchObject.SearchByAutoSuggest(Item);
			//System.out.println(searchObject.Search_ItemDetails.getText());
			

		
		//Assert.assertTrue(searchObject.Search_Result.getText().equalsIgnoreCase("Add to cart"));

		


	}


}
