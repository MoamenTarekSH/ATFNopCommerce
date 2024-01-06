package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "Email")
	WebElement E_Mail;
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(id = "RememberMe")
	WebElement Rememder_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement Login_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2")
	public WebElement Success_LoginMSG ;
	

	
	public void LoginInput(String email , String password)
	{
	EnterTXT(E_Mail, email);	
	EnterTXT(Password, password);
	CliCkButton(Rememder_Btn);
	CliCkButton(Login_Btn);
	}


}
