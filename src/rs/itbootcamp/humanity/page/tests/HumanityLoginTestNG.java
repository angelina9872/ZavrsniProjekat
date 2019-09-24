package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTestNG {

	@Test
	public static void loginTestNG() {

		// Postavka
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			// Otvaranje stranice
			driver.get("https://www.humanity.com/");
			// Insert username
			HumanityHome.clickLogIn(driver);
			HumanityHome.getUsernameBox(driver);
			HumanityHome.clickUsernameBox(driver);
			HumanityHome.inputUsername(driver, "gavagibi@web-inc.net");
			// InsertPassword
			HumanityHome.getPasswordBox(driver);
			HumanityHome.clickPasswordBox(driver);
			HumanityHome.inputPassword(driver, "Sifra123");
			// Click Login button
			HumanityHome.getLoginButton(driver);
			HumanityHome.clickLoginButton(driver);
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
			boolean login = driver.getCurrentUrl().contains("https://kompanija57.humanity.com/app/dashboard/");
			Assert.assertTrue(login);
			System.out.println("Login successful");
			
		} catch (Exception e) {
			Assert.fail();
			System.out.println("Login failed");
			System.out.println(e.toString());
		}
		driver.quit();
	}

}
