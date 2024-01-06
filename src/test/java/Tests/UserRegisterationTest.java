package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PagesObjects.ChangePassword;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.UserRegistrationPageObj;

public class UserRegisterationTest extends TestBase 
{

	HomePage homeObject ;
	UserRegistrationPageObj registerObject;
	LoginPage loginObject;
	ChangePassword changeObject ;  
	Faker fake = new Faker();
	String Fname = fake.name().firstName();
	String Lname = fake.name().lastName();
	String Email = fake.internet().emailAddress();
	String Pass = fake.internet().password();
	

	
	@Test(priority = 0)
	public void UserCanRegisterSuccssfully()
	{
		homeObject = new HomePage(driver);
		homeObject.OpenRegisterPage();
		registerObject = new UserRegistrationPageObj(driver);
		registerObject.RegisterVariabls(Fname, Lname, Email, Pass);
		Assert.assertTrue(registerObject.SuccssMSG.getText().contains("Your registration completed"));
		driver.navigate().back();
	}
	
	@Test(priority = 1)
	public void TestLoginSuccssfully()
	{
		homeObject = new HomePage(driver);
		homeObject.Login_Link.click();
		loginObject = new LoginPage(driver);
		loginObject.LoginInput(Email, Pass);
		Assert.assertTrue(loginObject.Success_LoginMSG.getText().contains("Welcome to our store"));
		
		
	}
	
	//@Test(priority = 2)
	public void TestChangPasswordSuccessfully()
	{
		homeObject = new HomePage(driver);
		homeObject.MyAcc_Link.click();
		homeObject.ChangPassword.click();
		changeObject = new ChangePassword(driver);
		changeObject.ChangeInput("123000", "123123");
		Assert.assertTrue(changeObject.Success_ChangeMSG.getText().contains("Password was changed"));		
	}
	
	
	
}
