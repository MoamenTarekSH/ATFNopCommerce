package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComperPage extends PageBase 
{

	public ComperPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/a")
	public WebElement Clear_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div")
	public WebElement ComperEmpty_MSG;
	

}
