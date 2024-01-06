package Steps;

import org.testng.Assert;

import com.github.javafaker.Faker;

import PagesObjects.HomePage;
import PagesObjects.UserRegistrationPageObj;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegisteration extends TestBase {
	
	HomePage homeObj;
	UserRegistrationPageObj registerObj;
	Faker fake = new Faker();
	String FristName = fake.name().firstName();
	String LastName = fake.name().lastName();
	String Email = fake.internet().emailAddress();
	String Pass = fake.internet().password();

	
	@Given("I in home page")
	public void i_in_home_page() 
	{
		homeObj = new HomePage(driver);
		driver.navigate().refresh();
	}
	
	@When("i clicl on register link")
	public void i_clicl_on_register_link() 
	{
		homeObj = new HomePage(driver);
		homeObj.OpenRegisterPage();
	}
	
	/*
	 * @When("i entered my data to register page") public void
	 * i_entered_my_data_to_register_page() { registerObj = new
	 * UserRegistrationPageObj(driver); registerObj.RegisterFakeVariabls(FristName,
	 * LastName, Email, Pass , Pass); }
	 */
	
	@When("i entered my data to register page {string},{string},{string},{string},{string}")
	public void i_entered_my_data_to_register_page(String firstname, String lastname, String email, String pass, String compass) 
	{
		registerObj = new UserRegistrationPageObj(driver);
		registerObj.RegisterVariabls(firstname, lastname, email, pass);
	}
	
	@Then("the registration page displayed successfully")
	public void the_registration_page_displayed_successfully() 
	{
		registerObj = new UserRegistrationPageObj(driver);
		Assert.assertTrue(registerObj.SuccssMSG.getText().contains("Your registration completed"));	
		driver.navigate().back();
	}

}
