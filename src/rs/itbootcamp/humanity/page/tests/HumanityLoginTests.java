package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;
import rs.itbootcamp.humanity.utility.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests {
	// Login->test if login is successful

	@SuppressWarnings("finally")
	public static boolean loginTest() {

		// Postavka
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			// Otvaranje stranice
			driver.get("https://www.humanity.com/");
			// Login
			HumanityHome.clickLogIn(driver);
			HumanityHome.clickUsernameBox(driver);
			HumanityHome.inputUsername(driver, "gavagibi@web-inc.net");
			HumanityHome.clickPasswordBox(driver);
			HumanityHome.inputPassword(driver, "Sifra123");
			HumanityHome.clickLoginButton(driver);
			Thread.sleep(3000);

			if (driver.getCurrentUrl().equals("https://kompanija57.humanity.com/app/dashboard/")) {
				System.out.println("Login successful");
				return true;
			} else {
				System.out.println("Login failed");
				return false;
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.quit();
			return true;
		}
	}

///// Method to login with data from Excell
	@SuppressWarnings("finally")
	public static boolean loginWithData() {
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Otvaranje stranice
		driver.get("https://www.humanity.com/");
		// Login
		HumanityHome.clickLogIn(driver);
		// Set excell
		String DATA_SOURCE = "Data.xls";
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);
		// Get data from excell
		String email, password;
		email = ExcelUtils.getDataAt(1, 0);
		password = ExcelUtils.getDataAt(1, 0);
		try {
			// Input excell data and login
			HumanityHome.clickUsernameBox(driver);
			HumanityHome.inputUsername(driver, email);
			HumanityHome.clickPasswordBox(driver);
			HumanityHome.inputPassword(driver, password);
			HumanityHome.clickLoginButton(driver);
			if (driver.getCurrentUrl().equals("https://kompanija57.humanity.com/app/dashboard/")) {
				System.out.println("Login successful");
				return true;
			} else {
				System.out.println("Login failed");
				return false;
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.quit();
			return true;

		}
	}
}
