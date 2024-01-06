package PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemReviewPage extends PageBase 
{

	public ItemReviewPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath =  "//*[@id=\"AddProductReview_Title\"]")
	WebElement ReviewTitle;
	
	
	@FindBy(xpath =  "//*[@id=\"AddProductReview_ReviewText\"]")
	WebElement ReviewTXT;
	
	
	@FindBy(xpath =  "//*[@id=\"addproductrating_4\"]")
	WebElement RatingMark;
	
	
	@FindBy(xpath =   "//*[@id=\"review-form\"]/form/div[2]/button")
	WebElement SubmitReview_Btn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
	public WebElement Success_ReviewMSG;
	
	public void ReviewInput(String revTitle , String revTxt )
	{
		EnterTXT(ReviewTitle, revTitle);
		EnterTXT(ReviewTXT, revTxt);
		CliCkButton(RatingMark);
		CliCkButton(SubmitReview_Btn);
		
	}
	
	
	

}
