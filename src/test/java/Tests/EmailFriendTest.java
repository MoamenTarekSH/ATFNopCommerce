package Tests;

import org.testng.annotations.Test;

import PagesObjects.DetailsItemPage;
import PagesObjects.EmailFriend;

public class EmailFriendTest extends TestBase {
	EmailFriend emailfrndObject ; 
	DetailsItemPage detailObject;
	@Test
	public void TestEmailFriend()
	{
		detailObject = new DetailsItemPage(driver);
		detailObject.EmailFriend();
		emailfrndObject = new EmailFriend(driver);
		emailfrndObject.SendEmail("asmdasd@gmail.com",  "asdasdasdas");
		//Assert.assertTrue(emailfrndObject.Success_EmailSent.getText().contains("Your message has been sent"));
	}

}
