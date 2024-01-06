package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.Advice.Enter;

public class ContactUs extends PageBase {

	public ContactUs(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "FullName")
	WebElement YourName;
	
	@FindBy(id = "Email")
	WebElement E_Mail;
	
	@FindBy(id = "Enquiry")
	WebElement Enquiry;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
	WebElement Submit_Btn;
	
	@FindBy(css = ".result")
	public WebElement Success_ContactMSG;
	
	public void ContactUsInput(String yourname , String email , String enquiry)
	{
		EnterTXT(YourName, yourname);
		EnterTXT(E_Mail, email);
		EnterTXT(Enquiry, enquiry);
		CliCkButton(Submit_Btn);
	
	}
	

	

}
