package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPageObj extends PageBase 
{

	public UserRegistrationPageObj(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(css  = "#gender-male")
	WebElement Gender_RDBTN;
	
	@FindBy(id="FirstName")
	WebElement FN_TXTBox;
	
	@FindBy(id="LastName")
	WebElement LN_TXTBox;
	
	@FindBy(id="Email")
	WebElement E_mail;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	WebElement ConfPassword;
	
	@FindBy(id="register-button")
	WebElement Register_BTN;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
	public WebElement SuccssMSG;
	
	public void  RegisterVariabls(String fName , String lName , String Email , String password )
	{
		CliCkButton(Gender_RDBTN);
		EnterTXT(FN_TXTBox, fName);
		EnterTXT(LN_TXTBox, lName);
		EnterTXT(E_mail, Email);
		EnterTXT(Password, password);
		EnterTXT(ConfPassword, password);
		CliCkButton(Register_BTN);
	}
	
	public void  RegisterFakeVariabls(String firstName , String lastName , String email , String password , String confpass )
	{
		CliCkButton(Gender_RDBTN);
		EnterTXT(FN_TXTBox, firstName);
		EnterTXT(LN_TXTBox, lastName);
		EnterTXT(E_mail, email);
		EnterTXT(Password, password);
		EnterTXT(ConfPassword, password);
		CliCkButton(Register_BTN);
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	