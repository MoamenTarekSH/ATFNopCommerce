package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase
{

	public CartPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id =  "updatecart")
	public WebElement UpdateCart_Btn;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr[1]/td[7]/button")
	public WebElement RemoveCart_Btn;
	
	@FindBy(id = "termsofservice")
	WebElement Term_Btn;

	@FindBy(id = "checkout")
	WebElement CheckOut_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")
	WebElement CheckoutAsGuest_BTN;
	
	public void OpenCheckOut()
	{
		CliCkButton(Term_Btn);
		CliCkButton(CheckOut_Btn);
	}
	
	
	public void OpenCheckoutAsAGuest() throws InterruptedException
	{
		CliCkButton(Term_Btn);
		CliCkButton(CheckOut_Btn);
		Thread.sleep(2000);
		CliCkButton(CheckoutAsGuest_BTN);
	}
	
}
