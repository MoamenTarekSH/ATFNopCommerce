package Tests;

import org.testng.annotations.Test;

import PagesObjects.CartPage;
import PagesObjects.CheckOutPage;
import PagesObjects.DetailsItemPage;
import PagesObjects.SearchPage;

public class CheckOutAsGuestTest2 extends TestBase{

	SearchPage searchObject ;
	String Item1 = "Leica T Mirrorless Digital Camera";
	DetailsItemPage detailObject ; 
	CartPage cartObject ;
	CheckOutPage checkObject;


	@Test(priority = 0)
	public void SearchItemToCheckOut() throws InterruptedException
	{
		try 
		{
			searchObject = new SearchPage(driver);
			searchObject.SearchItemTwoToCompare(Item1);
			Thread.sleep(2000);
			detailObject = new DetailsItemPage(driver);
			detailObject.AddToCart();
			detailObject.OpenCartPage();
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("Error Occurred===>" + e.getMessage());
		}
	}

	@Test(priority =1)
	public void OpenCartPageThenCheckPage() throws InterruptedException
	{
		cartObject = new CartPage(driver);
		cartObject.OpenCheckoutAsAGuest();
	}
	
	
	@Test(priority = 2)
	
	public void TestCheckOutSteps() throws InterruptedException
	{
		checkObject = new CheckOutPage(driver);
		checkObject.CheckOutInputAsAGuest("werwrw", "werwette", "ertert@gmail.com", "sdfsdfs", "sdfsdfs", "787242", "0175458775");
		checkObject.ConfirmCard("rtyrtytyrt", "6250941006528599", "738");
		checkObject.OrderDetailAndPrint();
		
	}
	
	
	
	
	



}
