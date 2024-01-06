package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase 
{

	public CheckOutPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy( id =  "BillingNewAddress_FirstName")
	WebElement F_Name;
	
	@FindBy( id =  "BillingNewAddress_LastName")
	WebElement L_Name;
	
	@FindBy(id =   "BillingNewAddress_Email")
	WebElement Email;
	
	@FindBy(xpath =   "//*[@id=\"BillingNewAddress_CountryId\"]")
	WebElement Contry;
	
	@FindBy(id =   "BillingNewAddress_City")
	WebElement City;
	
	@FindBy(id =   "BillingNewAddress_Address1")
	WebElement Address1;
	
	@FindBy(id =   "BillingNewAddress_ZipPostalCode")
	WebElement ZIP;
	
	@FindBy(id =   "BillingNewAddress_PhoneNumber")
	WebElement Phone;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")
	WebElement Continue_Btn;
	
	@FindBy(id = "shippingoption_1")
	WebElement ShippingPay_Btn;
	
	@FindBy(xpath =  "//*[@id=\"shipping-method-buttons-container\"]/button")
	WebElement ContinuePay_Btn;
	
	@FindBy(id  =  "paymentmethod_1")
	WebElement PayCreditCard_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")
	WebElement CardContinue;

	@FindBy(id ="CreditCardType")
	WebElement SelectCreditCard;

	@FindBy(id = "CardholderName")
	WebElement CardName;
	
	@FindBy(id = "CardNumber")
	WebElement CardNum;
	
	@FindBy(id = "ExpireMonth")
	WebElement ExpireMonth ;
	
	@FindBy(id = "ExpireYear")
	WebElement ExpireYear;
	
	@FindBy(id = "CardCode")
	WebElement CardCode;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")
	WebElement ContinueCardInfo;
	
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")
	WebElement FinalContinue_Btn;
	
	
	//Your order has been successfully processed!
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
	WebElement Success_MSG;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button")
	WebElement ThenContinue;
	
	@FindBy(linkText = "Click here for order details.")
	WebElement OrderDetail_Link;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/a[2]")
	WebElement PDFInvoice;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/a[1]")
	WebElement Print_Btn;
	
	
	//Checkout as resgistered account
	public void CheckOutInput(String city,String address , String zip , String phone ) throws InterruptedException
	{
		Select select = new Select(Contry);
		select.selectByValue("201");
		EnterTXT(City, city);
		EnterTXT(Address1, address);
		EnterTXT(ZIP, zip);
		EnterTXT(Phone, phone);
		CliCkButton(Continue_Btn);
		Thread.sleep(2000);
		CliCkButton(ShippingPay_Btn);
		CliCkButton(ContinuePay_Btn);
		Thread.sleep(2000);
		CliCkButton(PayCreditCard_Btn);
		CliCkButton(CardContinue);
		Thread.sleep(2000);
	}
	
	
	public void ConfirmCard(String name , String Number , String code)
	{
		Select sel = new Select(SelectCreditCard);
		sel.selectByVisibleText("Master card");
		EnterTXT(CardName, name);
		EnterTXT(CardNum, Number);
		Select selMonth = new Select(ExpireMonth);
		selMonth.selectByVisibleText("02");
		Select selYear = new Select(ExpireYear);
		selYear.selectByVisibleText("2026");
		EnterTXT(CardCode, code);
		CliCkButton(ContinueCardInfo);
		CliCkButton(FinalContinue_Btn);
	}
	
	public void OrderDetailAndPrintPDFInvice() 
	{
		CliCkButton(OrderDetail_Link);
		CliCkButton(PDFInvoice);
	}
	
	
	
	public void CheckOutInputAsAGuest(String firstname , String lastname , String email ,String city,String address , String zip , String phone ) throws InterruptedException
	{
		EnterTXT(F_Name, firstname);
		EnterTXT(L_Name, lastname);
		EnterTXT(Email, email);
		Select select = new Select(Contry);
		select.selectByValue("123");
		EnterTXT(City, city);
		EnterTXT(Address1, address);
		EnterTXT(ZIP, zip);
		EnterTXT(Phone, phone);
		CliCkButton(Continue_Btn);
		Thread.sleep(2000);
		CliCkButton(ShippingPay_Btn);
		CliCkButton(ContinuePay_Btn);
		Thread.sleep(2000);
		CliCkButton(PayCreditCard_Btn);
		CliCkButton(CardContinue);
		Thread.sleep(2000);
	}
	
	//Use In Checkout As A Guest
	public void OrderDetailAndPrint() 
	{
		CliCkButton(OrderDetail_Link);
		CliCkButton(Print_Btn);
	}
	
}
