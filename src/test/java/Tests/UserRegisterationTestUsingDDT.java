package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PagesObjects.ChangePassword;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.UserRegistrationPageObj;

public class UserRegisterationTestUsingDDT extends TestBase 
{

	HomePage homeObject ;
	UserRegistrationPageObj registerObject;
	LoginPage loginObject;
	ChangePassword changeObject ;  
	public static String Email = "MoamenShaban9988@gmail.com";
	String Password = "87987465";  
	
	
	@DataProvider(name="TestData")
	public static Object[][] userData()
	{
		return new Object[][]
				{
			{"tests","tests","test0000@gmail.com","123456789"},
			{"tests","tests","test1111@gmail.com","123456789"}
				};
	}
	@Test(priority = 0,dataProvider = "TestData")
	public void UserCanRegisterSuccssfully(String name, String lname,String email,String pass) throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.OpenRegisterPage();
		registerObject = new UserRegistrationPageObj(driver);
		registerObject.RegisterVariabls(name, lname, email, pass);
		//Assert.assertTrue(registerObject.SuccssMSG.getText().contains("Your registration completed"));
		Thread.sleep(2000);
		driver.navigate().back();
		homeObject.Login();
		loginObject = new LoginPage(driver);
		loginObject.LoginInput(email, pass);
		//Assert.assertTrue(loginObject.Success_LoginMSG.getText().contains("Welcome to our store"));
		Thread.sleep(4000);
		homeObject.Logout();
		//Assert.assertTrue(homeObject.LogOut_Link.getText().equalsIgnoreCase("log out"));
	}
	

	
	
}
