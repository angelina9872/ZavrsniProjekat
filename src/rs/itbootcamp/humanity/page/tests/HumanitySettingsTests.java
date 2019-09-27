package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTests {

	public static void settingsTest() throws InterruptedException {
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			HumanityHome.login(driver);
			// Open settings page
			HumanityMenu.clickSettingsButton(driver);
			// Test country,language and time format
			HumanitySettings.inputCountry(driver, "Serbia");
			HumanitySettings.inputLanguage(driver, "American English");
			HumanitySettings.inputTimeFormat(driver, "24 hour");

			HumanitySettings.clickSaveSettingsButton(driver);
			System.out.println("Settings updated successfully.");
			driver.quit();

		} catch (Exception ae) {
			System.out.println(ae.getMessage());
		}

	}
}
