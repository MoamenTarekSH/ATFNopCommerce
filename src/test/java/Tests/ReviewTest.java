package Tests;

import org.testng.annotations.Test;

import PagesObjects.HomePage;
import PagesObjects.ItemReviewPage;
import PagesObjects.SearchPage;

public class ReviewTest extends TestBase{
	
	ItemReviewPage reviewObject;
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
	
	
	@Test(priority = 1)
	public void TestMakingReview()
	{
		searchObject = new SearchPage(driver);
		reviewObject = new ItemReviewPage(driver);
		searchObject.OpenReviewLink();
		reviewObject.ReviewInput("tererte", "rwewerwerwerwwrwerwe");
		//Assert.assertTrue(reviewObject.Success_ReviewMSG.getText().contains("Product review is successfully added"));
	}
	

}
