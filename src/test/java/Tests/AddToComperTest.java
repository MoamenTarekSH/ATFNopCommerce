package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PagesObjects.ComperPage;
import PagesObjects.DetailsItemPage;
import PagesObjects.SearchPage;

public class AddToComperTest extends TestBase{

	SearchPage searchObject ;
	String Item1 = "Nikon D5500 DSLR";
	String Item2 = "Leica T Mirrorless Digital Camera";
	DetailsItemPage detailObject ; 
	ComperPage compareObject ;

	@Test(priority = 0)
	public void SearchItemOneToComparer() throws InterruptedException
	{
		try 
		{
			searchObject = new SearchPage(driver);
			searchObject.SearchItemOneToCompare(Item1);
			Thread.sleep(4000);		
			detailObject = new DetailsItemPage(driver);
			detailObject.AddToCompare();	
		} 
		catch (Exception e) 
		{
			System.out.println("Error Occurred===>" + e.getMessage());
		}
	}

	@Test(priority = 1)
	public void SearchItemTwoToCompare() throws InterruptedException
	{
		try 
		{
			searchObject = new SearchPage(driver);
			searchObject.SearchItemTwoToCompare(Item2);
			Thread.sleep(2000);
			detailObject = new DetailsItemPage(driver);
			detailObject.AddToCompare();
			detailObject.OpenComparePage();
		} 
		catch (Exception e) 
		{
			System.out.println("Error Occurred===>" + e.getMessage());
		}
	}

	@Test(priority =3 )
	public void TestComparePage()
	{
		compareObject = new ComperPage(driver);
		Assert.assertTrue(compareObject.Clear_Btn.getText().contains("CLEAR"));
		compareObject.Clear_Btn.click();
		Assert.assertTrue(compareObject.ComperEmpty_MSG.getText().contains("You have no items to compare."));
	}



}
