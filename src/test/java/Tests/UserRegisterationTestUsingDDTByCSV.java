package Tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import PagesObjects.ChangePassword;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.UserRegistrationPageObj;

public class UserRegisterationTestUsingDDTByCSV extends TestBase 
{
	HomePage homeObject ;
	UserRegistrationPageObj registerObject;
	LoginPage loginObject;
	ChangePassword changeObject ;  
	CSVReader reader;
	
	
	@Test(priority = 0)
	public void UserCanRegisterSuccssfully() throws CsvValidationException, IOException, InterruptedException
	{
		String CSV_File ="C:\\WorkSpace\\ATFNopCommerce\\src\\test\\java\\DataDriven\\tableConvert.com_dzq30m.csv";
		reader = new CSVReader (new FileReader(CSV_File));
		String[] csvcell ;
		while((csvcell = reader.readNext()) != null)
		{
			String firstname = csvcell[0];
			String lastname = csvcell[1];
			String email = csvcell[2];
			String pass = csvcell[3]; 
		
		homeObject = new HomePage(driver);
		homeObject.OpenRegisterPage();
		registerObject = new UserRegistrationPageObj(driver);
		registerObject.RegisterVariabls(firstname , lastname, email, pass);
		Thread.sleep(2000);
		driver.navigate().back();
		homeObject.Login();
		loginObject = new LoginPage(driver);
		loginObject.LoginInput(email, pass);
		Thread.sleep(4000);
		homeObject.Logout();
		}
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
