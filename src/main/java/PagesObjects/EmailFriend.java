package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriend extends PageBase{

	public EmailFriend(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "FriendEmail")
	WebElement Email_Friend;
	
	@FindBy(id = "YourEmailAddress")
	WebElement Email;
	
	@FindBy(id = "PersonalMessage")
	WebElement Sent_MSG;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
	WebElement Send_Btn;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]")
	public WebElement Success_EmailSent;
	
	
	public void SendEmail(String friendemail ,  String sentmsg)
	{
		EnterTXT(Email_Friend, friendemail);
		EnterTXT(Sent_MSG, sentmsg);
		CliCkButton(Send_Btn);
		
	}
	

}
