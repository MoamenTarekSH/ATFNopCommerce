package PagesObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	protected WebDriver driver;
	JavascriptExecutor JSE ; 
	public Select select ;
	public Actions Act ;
	public WebDriverWait wait;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	protected static void CliCkButton (WebElement button) 
	{
		button.click();
	}

	protected static void EnterTXT (WebElement textElement , String value)
	{
		textElement.sendKeys(value);
	}
	
	public void ScrollDown()
	{
		JSE.executeScript("scrollBy(0,2500)");
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
