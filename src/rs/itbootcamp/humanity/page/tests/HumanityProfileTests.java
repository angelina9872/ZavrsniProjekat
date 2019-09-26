package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityProfileTests {

	public static void editProfileTest() throws InterruptedException {
		// Browser settings
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Open home page and login
		driver.get("https://www.humanity.com/");
		// Login
		HumanityHome.clickLogIn(driver);
		HumanityHome.clickUsernameBox(driver);
		HumanityHome.inputUsername(driver, "gavagibi@web-inc.net");
		HumanityHome.clickPasswordBox(driver);
		HumanityHome.inputPassword(driver, "Sifra123");
		HumanityHome.clickLoginButton(driver);

		HumanityProfile.clickArrowButton(driver);
		Thread.sleep(3000);
		HumanityProfile.clickSettingsLink(driver);
		HumanityEditStaff.clickUploadPictureButton(driver);
		HumanityEditStaff.uploadPicture(driver);

		driver.quit();
	}
}
