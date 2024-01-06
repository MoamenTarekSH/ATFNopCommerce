package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase 
{

	public WishListPage(WebDriver driver) 
	{
		super(driver);
	}

	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/span")
	public WebElement Success_AddToWish;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[8]/button")
	public WebElement RemoveWish_Btn;
	
	@FindBy(id = "updatecart")
	public WebElement UpdatWis_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div")
	public WebElement EmptyWishList;
}
