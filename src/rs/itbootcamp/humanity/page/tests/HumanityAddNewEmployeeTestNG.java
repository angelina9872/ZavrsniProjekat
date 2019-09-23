package rs.itbootcamp.humanity.page.tests;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

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
	public static void addEmployeeTest() throws InterruptedException {

		// Postavka
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

//		//Otvaranje stranice
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

		// Open home page and then staff page
		HumanityMenu.clickStaffButton(driver);
		driver.get(HumanityStaff.STAFFPAGE_URL);
		// Provera da smo na dobroj stranici
		boolean rez = driver.getCurrentUrl().contains(HumanityStaff.STAFFPAGE_URL);
		Assert.assertTrue(rez);

		// Dodavanje zaposlenog
		HumanityStaff.getAddEmployeeButton(driver);
		HumanityStaff.clickAddEmployeeButton(driver);
		HumanityStaff.clickFirstNameBox(driver);
		HumanityStaff.inputFirstName(driver, "Zlatko");
		HumanityStaff.clickLastNameBox(driver);
		HumanityStaff.inputFirstName(driver, "Milojevic");
		HumanityStaff.clickEmailBox(driver);
		HumanityStaff.inputEmail(driver, "email@gmail.com");
		
		
		driver.quit();
	}
}
