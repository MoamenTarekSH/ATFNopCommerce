package PagesObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsItemPage extends PageBase  
{

	public DetailsItemPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[2]")
	WebElement AddTOCompare_Btn;
	
	
	@FindBy(linkText =   "product comparison")
	public WebElement Comper_Link;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[3]")
	public WebElement Wish_Btn;
	
	@FindBy(xpath = "//*[@id=\"add-to-wishlist-button-14\"]")
	WebElement AddTOWishList_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")
	WebElement WishList_Link;
	 
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[4]/div[2]/button")
	WebElement EmailAFriend_Btn;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
	WebElement AddTOCart_Btn;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
	public WebElement AddToCart_Btn2;
	
	@FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
	WebElement Cart_Link;
	 
	
	@FindBy(linkText =  "Be the first to review this product")
	WebElement AddReview_Btn;
	
	public void AddToCompare()
	{
		CliCkButton(AddTOCompare_Btn);
	}
	
	public void OpenComparePage()
	{
		CliCkButton(Comper_Link);
	}

	
	
	public void AddToWishList()
	{
		CliCkButton(Wish_Btn);	
	}
	
	public void OpenWishList()
	{
		CliCkButton(WishList_Link);
	}
	
	public void AddToCart()
	{
		CliCkButton(AddTOCart_Btn);
	}
	
	public void AddToCart2()
	{
		CliCkButton(AddToCart_Btn2);
	}
	
	public void OpenCartPage()
	{
		CliCkButton(Cart_Link);
	}
	
	public void EmailFriend()
	{
		CliCkButton(EmailAFriend_Btn);
	}
	

}
