package PagesObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) 
	{
		
		super(driver);
		JSE = (JavascriptExecutor) driver ;
		Act = new Actions(driver);
	}
	

	@FindBy(linkText = "Register")
	WebElement Reg_Link;
	
	@FindBy(linkText = "Log in")
	public WebElement Login_Link;
	
	@FindBy(linkText = "My account")
	public WebElement MyAcc_Link;
	
	@FindBy(linkText = "Change password")
	public WebElement ChangPassword;
	
	@FindBy(linkText = "Contact us")
	WebElement ConactUs_Link;
	
	@FindBy(id = "customerCurrency")
	WebElement Currency;
	
	@FindBy(xpath =  "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement ComputerMenu;
	
	@FindBy(xpath  = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
	WebElement NoteBooksSelect;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public WebElement LogOut_Link;

	
	public void OpenRegisterPage()
	{
		CliCkButton(Reg_Link);
	}
	
	public void OpenContactUsPage()
	{
		ScrollDown();
		CliCkButton(ConactUs_Link);
	}
	
	public void ChangeCurrency()
	{
		select = new Select(Currency);
		select.selectByVisibleText("Euro");
		
	}
	
	public void SelectNoteBook()
	{
		Act
		.moveToElement(ComputerMenu)
		.moveToElement(NoteBooksSelect)
		.click()
		.build()
		.perform();
	}
	
	public void Login()
	{
		CliCkButton(Login_Link);
	}
	
	public void Logout()
	{
		CliCkButton(LogOut_Link);
	}
	

	
	
	
	
}
