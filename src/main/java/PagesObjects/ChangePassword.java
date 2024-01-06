package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassword extends PageBase 
{

	public ChangePassword(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "OldPassword")
	WebElement Old_Pass;
	
	@FindBy(id = "NewPassword")
	WebElement New_Pass;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement Conf_Pass;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
	WebElement Change_Btn;
	
	@FindBy(xpath = "/html/body/div[5]/div/p")
	public WebElement Success_ChangeMSG ;
	
	
	public void ChangeInput(String oldpass , String newpass  )
	{
		EnterTXT(Old_Pass, oldpass);
		EnterTXT(New_Pass, newpass);
		EnterTXT(Conf_Pass, newpass);
		CliCkButton(Change_Btn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
