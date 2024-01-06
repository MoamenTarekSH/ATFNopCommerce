package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PagesObjects.ContactUs;
import PagesObjects.HomePage;

public class ContactUsTest extends TestBase {
	
	ContactUs contactusObject ;
	HomePage homepageObject;
	
	@Test
	public void TestContactUs()
	{
		homepageObject = new HomePage(driver);
		homepageObject.OpenContactUsPage();
		contactusObject = new ContactUs(driver);
		contactusObject.ContactUsInput("Moamen", "Nader123@gmail.com", "sdswerwerweqweq");
		//Assert.assertTrue(contactusObject.Success_ContactMSG.getText().contains("Your enquiry has been successfully sent to the store owner"));		
		
	}
	

}
