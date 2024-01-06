package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDriven.LoadProperties;
import PagesObjects.ChangePassword;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.UserRegistrationPageObj;

public class UserRegisterationTestUsingDDTByProperties extends TestBase 
{

	HomePage homeObject ;
	UserRegistrationPageObj registerObject;
	LoginPage loginObject;
	ChangePassword changeObject ;  
	String fristname = LoadProperties.userData.getProperty("feristname");
	String lastname = LoadProperties.userData.getProperty("lastname");
	String email = LoadProperties.userData.getProperty("email");
	String password = LoadProperties.userData.getProperty("password");

	@Test(priority = 0)
	public void UserCanRegisterSuccssfully() throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.OpenRegisterPage();
		registerObject = new UserRegistrationPageObj(driver);
		registerObject.RegisterVariabls(fristname, lastname, email, password);
		//Assert.assertTrue(registerObject.SuccssMSG.getText().contains("Your registration completed"));
		Thread.sleep(2000);
		driver.navigate().back();
		homeObject.Login();
		loginObject = new LoginPage(driver);
		loginObject.LoginInput(email, password);
		//Assert.assertTrue(loginObject.Success_LoginMSG.getText().contains("Welcome to our store"));
		Thread.sleep(4000);
		homeObject.Logout();
		//Assert.assertTrue(homeObject.LogOut_Link.getText().equalsIgnoreCase("log out"));
	}
	

	
	
}
