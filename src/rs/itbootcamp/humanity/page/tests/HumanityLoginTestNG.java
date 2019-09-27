package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTestNG {

	@Test
	public static void loginTestNG(WebDriver driver) {

		try {
			HumanityHome.login(driver);
			boolean login = driver.getCurrentUrl().contains("https://kompanija57.humanity.com/app/dashboard/");
			Assert.assertTrue(login);
			System.out.println("Login successful.");

		} catch (Exception e) {
			Assert.fail();
			System.out.println("Login failed.");
			System.out.println(e.toString());
		}
		driver.quit();
	}

}
