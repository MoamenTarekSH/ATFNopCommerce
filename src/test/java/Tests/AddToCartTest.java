package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.TreeBasedTable;

import PagesObjects.CartPage;
import PagesObjects.ComperPage;
import PagesObjects.DetailsItemPage;
import PagesObjects.SearchPage;

public class AddToCartTest extends TestBase{

	SearchPage searchObject ;
	String Item1 = "HTC One M8 Android L 5.0 Lollipop";
	String Item2 = "Leica T Mirrorless Digital Camera";
	DetailsItemPage detailObject ; 
	CartPage cartObject ;
	

	@Test(priority = 0)
	public void SearchItemOneToCart() throws InterruptedException
	{
		try 
		{
			searchObject = new SearchPage(driver);
			searchObject.SearchItemOneToCompare(Item1);
			detailObject = new DetailsItemPage(driver);
			Thread.sleep(4000);
			detailObject.AddToCart_Btn2.click();	
		} 
		catch (Exception e) 
		{
			System.out.println("Error Occurred===>" + e.getMessage());
		}
	}

	@Test(priority = 1)
	public void SearchItemTwoToCart() throws InterruptedException
	{
		try 
		{
			searchObject = new SearchPage(driver);
			searchObject.SearchItemTwoToCompare(Item2);
			Thread.sleep(2000);
			detailObject = new DetailsItemPage(driver);
			detailObject.AddToCart();
			Thread.sleep(4000);
			detailObject.OpenCartPage();
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("Error Occurred===>" + e.getMessage());
		}
	}

	@Test(priority =3 )
	public void TestCartPage()
	{
		cartObject = new CartPage(driver);
		Assert.assertTrue(cartObject.UpdateCart_Btn.getText().contains("Update"));
		cartObject.RemoveCart_Btn.click();
		cartObject.UpdateCart_Btn.click();
	}



}
