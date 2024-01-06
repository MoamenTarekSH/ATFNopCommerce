package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PagesObjects.DetailsItemPage;
import PagesObjects.HomePage;
import PagesObjects.SearchPage;
import PagesObjects.WishListPage;

public class AddToWishTest extends TestBase {
	
	SearchPage searchObject ; 
	WishListPage wishObject ; 	
	DetailsItemPage detailObject;
	
	HomePage  homepageObject;
	String Item = "HTC One M8 Android L 5.0 Lollipop";

	@Test(priority = 0)
	public void TestSearch()
	{
		searchObject = new SearchPage(driver);
		searchObject.SearchInput(Item);
		//Assert.assertTrue(searchObject.Search_Result.getText().equalsIgnoreCase("Add to cart"));
		//System.out.println(searchObject.SearchItemDetails());
	}
	
	@Test(priority = 1)
	public void TestAddToWish() throws InterruptedException
	{
		
		detailObject = new DetailsItemPage(driver);
		detailObject.AddToWishList();
		Thread.sleep(4000);

	
	}
	@Test(priority = 2)
	public void TestWishList() throws InterruptedException
	{
		detailObject = new DetailsItemPage(driver);
		detailObject.OpenWishList();
		wishObject = new WishListPage(driver);
		Assert.assertTrue(wishObject.Success_AddToWish.getText().contains("Your wishlist URL for sharing"));
		Thread.sleep(2000);
		wishObject.RemoveWish_Btn.click();
		Thread.sleep(1000);
		//wishObject.UpdatWis_Btn.click();
		Assert.assertTrue(wishObject.EmptyWishList.getText().contains("The wishlist is empty!"));
	}

}
