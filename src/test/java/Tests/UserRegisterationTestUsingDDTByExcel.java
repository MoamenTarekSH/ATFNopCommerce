package Tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDriven.ExcelReader;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.UserRegistrationPageObj;

public class UserRegisterationTestUsingDDTByExcel extends TestBase 
{

	HomePage homeObject ;
	UserRegistrationPageObj registerObject;
	LoginPage loginObject;

	
	
	@DataProvider(name="ExcelData")
	public  Object[][] UserRegisterData() throws IOException 
	{
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}
	@Test(priority = 0,dataProvider = "ExcelData")
	public void UserCanRegisterSuccssfully(String firstname, String lastname,String email,String pass) throws InterruptedException
	{
		homeObject = new HomePage(driver);
		homeObject.OpenRegisterPage();
		registerObject = new UserRegistrationPageObj(driver);
		registerObject.RegisterVariabls(firstname, lastname, email, pass);
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
