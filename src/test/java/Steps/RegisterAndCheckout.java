package Steps;

import PagesObjects.CartPage;
import PagesObjects.CheckOutPage;
import PagesObjects.DetailsItemPage;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.SearchPage;
import PagesObjects.UserRegistrationPageObj;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterAndCheckout extends TestBase 
{
	HomePage homeObj;
	UserRegistrationPageObj registerObj;
	LoginPage loginObj;
	SearchPage searchObj;
	CartPage cartObj;
	DetailsItemPage detailObj;
	CheckOutPage checkObj;

	@Given("i open home page")
	public void i_open_home_page() 
	{
		homeObj = new HomePage(driver);
		driver.navigate().refresh();
	}

	@When("i click on Register link")
	public void i_click_on_register_link() 
	{
		homeObj = new HomePage(driver);
		homeObj.OpenRegisterPage();
	}

	@When("i entered {string} , {string} , {string} , {string}")
	public void i_entered(String FirstName, String LastName, String Email, String Password) 
	{
		registerObj = new UserRegistrationPageObj(driver);
		registerObj.RegisterVariabls(FirstName, LastName, Email, Password);
		homeObj = new HomePage(driver);
		homeObj.Login();
		loginObj = new LoginPage(driver);
		loginObj.LoginInput(Email, Password);
		
	}

	@When("i searche for {string}")
	public void i_searche_for(String ItemName) 
	{
		searchObj = new SearchPage(driver);
		searchObj.SearchInput(ItemName);
	}

	@When("Add item to cart")
	public void add_item_to_cart() throws InterruptedException 
	{
		detailObj = new DetailsItemPage(driver);
		detailObj.AddToCart();
		Thread.sleep(6000);
		detailObj.OpenCartPage();
		cartObj = new CartPage(driver);
		cartObj.OpenCheckOut();
	}

	@When("i make checkout for item")
	public void i_make_checkout_for_item() throws InterruptedException 
	{
		checkObj = new CheckOutPage(driver);
		checkObj.CheckOutInput("Zagazig", "Egypt", "123456", "01023456789");
	}

	@When("confirm Cridet card")
	public void confirm_cridet_card() 
	{
		checkObj = new CheckOutPage(driver);
		checkObj.ConfirmCard("Moamen", "3566000020000410", "123");
	}

	@Then("I print pdf Innvoice")
	public void i_print_pdf_innvoice() 
	{
	 checkObj = new CheckOutPage(driver);
	 checkObj.OrderDetailAndPrintPDFInvice();
	}
}
