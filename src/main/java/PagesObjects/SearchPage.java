package PagesObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) 
	{
		super(driver);
		JSE = (JavascriptExecutor) driver ;
		Act = new Actions(driver);
	}
	

	@FindBy(id = "small-searchterms")
	WebElement Search;
	
	@FindBy(xpath =  "//*[@id=\"small-search-box-form\"]/button")
	WebElement Search_Btn;
	
	@FindBy(css =  ".product-box-add-to-cart-button")
	public WebElement Search_Result;
	
	@FindBy(xpath =  "//*[@id=\"ui-id-1\"]")
	List<WebElement> Search_List;
	
	@FindBy(xpath =  "//*[@id=\"ui-id-1\"]/li[1]")
	WebElement Index_1;
	
	@FindBy(xpath =  "//*[@id=\"ui-id-1\"]/li[2]")
	WebElement Index_2;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[2]")
	public WebElement Search_ItemDetails;
	
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button")
	WebElement EmailAFriend ;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/span")
	public WebElement Currency_Sign;
	
	
	
	@FindBy(xpath =  "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a")
	WebElement Review_Link;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[3]")
	public WebElement Wish_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")
	WebElement Wish_List;
	


	public void SearchInput(String searchItem  )
	{
		EnterTXT(Search, searchItem);
		CliCkButton(Search_Btn);
	}
		
	
	public void SearchByAutoSuggest(String searchItem) throws InterruptedException
	{
		EnterTXT(Search, searchItem);
		Thread.sleep(2000);
		Search_List.get(0);
		Act.moveToElement(Index_1).click().build().perform();	
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"ui-id-1\\\"]")));
		
		
	}
	

	
	public void SearchItemOneToCompare(String searchItem) throws InterruptedException
	{
		EnterTXT(Search, searchItem);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-2")));
		//Act.moveToElement(Index_1).click().build().perform();	
		CliCkButton(Search_Btn);
	}
	
	
	//Use This Method To Search for two Items To Compare
	public void SearchItemTwoToCompare(String searchItem) throws InterruptedException
	{
		EnterTXT(Search, searchItem);
		//Thread.sleep(4000)
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-id-3")));
		//Act.moveToElement(Index_2).click().build().perform();
		CliCkButton(Search_Btn);
	}
	
	public void OpenReviewLink()
	{
		CliCkButton(Review_Link);
		
	}
	


	

	
	

	
	
}
