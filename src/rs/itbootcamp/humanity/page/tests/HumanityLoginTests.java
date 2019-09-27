package rs.itbootcamp.humanity.page.tests;

import rs.itbootcamp.humanity.utility.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLoginTests {
	// Login->test if login is successful

	@SuppressWarnings("finally")
	public static boolean loginTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			HumanityHome.login(driver);
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
	public static boolean loginWithData() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Login
		HumanityHome.login(driver);
		// Set excell
		String DATA_SOURCE = "Data.xls";
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);
		// Get data from excell
		String email, password;
		email = ExcelUtils.getDataAt(1, 0);
		password = ExcelUtils.getDataAt(1, 1);
		try {
			// Import excell data and login
			HumanityHome.clickUsernameBox(driver);
			HumanityHome.inputUsername(driver, email);
			HumanityHome.clickPasswordBox(driver);
			HumanityHome.inputPassword(driver, password);
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
}
