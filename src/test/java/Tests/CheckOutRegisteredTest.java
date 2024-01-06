package Tests;

import org.testng.annotations.Test;

import PagesObjects.CartPage;
import PagesObjects.CheckOutPage;
import PagesObjects.DetailsItemPage;
import PagesObjects.SearchPage;

public class CheckOutRegisteredTest extends TestBase{

	SearchPage searchObject ;
	String Item1 = "HTC One M8 Android L 5.0 Lollipop";
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
			Thread.sleep(4000);
			detailObject.OpenCartPage();
			
			
		} 
		catch (Exception e) 
		{
			System.out.println("Error Occurred===>" + e.getMessage());
		}
	}

	@Test(priority =1)
	public void OpenCartPageThenCheckPage()
	{
		cartObject = new CartPage(driver);
		cartObject.OpenCheckOut();
	}
	
	
	@Test(priority = 2)
	
	public void TestCheckOutSteps() throws InterruptedException
	{
		checkObject = new CheckOutPage(driver);
		checkObject.CheckOutInput("Zagzig", "AboTahh", "124578", "0147852685");
		checkObject.ConfirmCard("MoamenShaban", "6250941006528599", "738");
		checkObject.OrderDetailAndPrintPDFInvice();
		
	}
	
	
	
	
	



}
