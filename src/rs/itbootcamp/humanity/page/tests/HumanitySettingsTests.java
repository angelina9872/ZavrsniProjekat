package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTests {

	public static void settingsTest() throws InterruptedException {
		// Open home page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.humanity.com/");
		// Login
		HumanityHome.clickLogIn(driver);
		HumanityHome.clickUsernameBox(driver);
		HumanityHome.inputUsername(driver, "gavagibi@web-inc.net");
		HumanityHome.clickPasswordBox(driver);
		HumanityHome.inputPassword(driver, "Sifra123");
		HumanityHome.clickLoginButton(driver);
		Thread.sleep(3000);
		try {
			// Open settings page
			HumanityMenu.clickSettingsButton(driver);
			// Test country,language and time format
			HumanitySettings.inputCountry(driver, "Serbia");
			HumanitySettings.inputLanguage(driver, "Serbian (machine)");
			HumanitySettings.inputTimeFormat(driver, "24 hour");

			HumanitySettings.clickSaveSettingsButton(driver);
			System.out.println("Settings updated successfully");

		} catch (Exception ae) {
			System.out.println(ae.getMessage());
		}
		driver.quit();
	}
}