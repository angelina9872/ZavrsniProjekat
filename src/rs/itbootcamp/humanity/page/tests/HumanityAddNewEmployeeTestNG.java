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

		// Postavka
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Otvaranje stranice
		driver.get("https://www.humanity.com/");
		try {
			// Login
			HumanityHome.clickLogIn(driver);
			HumanityHome.clickUsernameBox(driver);
			HumanityHome.inputUsername(driver, "gavagibi@web-inc.net");
			HumanityHome.clickPasswordBox(driver);
			HumanityHome.inputPassword(driver, "Sifra123");
			HumanityHome.clickLoginButton(driver);

			// Open home page and then staff page
			HumanityMenu.clickStaffButton(driver);

			// Dodavanje zaposlenog
			HumanityStaff.clickAddEmployeeButton(driver);
			HumanityStaff.clickFirstNameBox(driver);
			HumanityStaff.inputFirstName(driver, "Zlatko");
			HumanityStaff.clickLastNameBox(driver);
			HumanityStaff.inputLastName(driver, "Despotovic");
			HumanityStaff.clickEmailBox(driver);
			HumanityStaff.inputEmail(driver, "zlatkozlaja@gmail.com");
			HumanityStaff.clickSaveEmployeeButton(driver);
			Thread.sleep(5);
			System.out.println(driver.getCurrentUrl());
			boolean employee = driver.getCurrentUrl()
					.contains("https://babicazabica.humanity.com/app/staff/assignstaff&new");
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
