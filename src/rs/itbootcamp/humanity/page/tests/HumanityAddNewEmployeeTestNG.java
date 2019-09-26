package rs.itbootcamp.humanity.page.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Login-> Staff -> Add Employees -> Dodavanje novog zaposlenog
//Takodje je potrebno proveriti da li je dodavanje zaposlenog bilo uspešno.

public class HumanityAddNewEmployeeTestNG {

	@Test
	public static void addEmployeeTestNG() throws InterruptedException {

		// Browser setup
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Open home page
		driver.get("https://www.humanity.com/");
		// Login
		HumanityHome.clickLogIn(driver);
		HumanityHome.clickUsernameBox(driver);
		HumanityHome.inputUsername(driver, "gavagibi@web-inc.net");
		HumanityHome.clickPasswordBox(driver);
		HumanityHome.inputPassword(driver, "Sifra123");
		HumanityHome.clickLoginButton(driver);
		Thread.sleep(3000);
		HumanityMenu.clickStaffButton(driver);

		try {
			// Dodavanje zaposlenog
			HumanityStaff.clickAddEmployeeButton(driver);
			HumanityStaff.clickFirstNameBox(driver, 1);
			HumanityStaff.inputFirstName(driver, "Zlatko", 1);
			HumanityStaff.clickLastNameBox(driver, 1);
			HumanityStaff.inputLastName(driver, "Despotovic", 1);
			HumanityStaff.clickEmailBox(driver, 1);
			HumanityStaff.inputEmail(driver, "zlatkozlaja@gmail.com", 1);
			HumanityStaff.clickSaveEmployeeButton(driver);
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			boolean employee = driver.getCurrentUrl()
					.contains("https://kompanija57.humanity.com/app/staff/assignstaff&new");
			Assert.assertTrue(employee);
			System.out.println("Zaposleni uspesno dodat.");

		} catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		} finally {
			driver.quit();
		}
	}
}
