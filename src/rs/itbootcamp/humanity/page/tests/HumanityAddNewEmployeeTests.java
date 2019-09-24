package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	public static void addEmployeeTest() {

		// Postavka
		System.setProperty("wedriver.driver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Otvaranje stranice
		driver.get("https://www.humanity.com/");
		try {
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

			// Dodavanje zaposlenog
			HumanityStaff.getAddEmployeeButton(driver);
			HumanityStaff.clickAddEmployeeButton(driver);
			HumanityStaff.clickFirstNameBox(driver);
			HumanityStaff.inputFirstName(driver, "Zlatko");
			HumanityStaff.clickLastNameBox(driver);
			HumanityStaff.inputLastName(driver, "Milojevic");
			HumanityStaff.clickEmailBox(driver);
			HumanityStaff.inputEmail(driver, "email@gmail.com");
			HumanityStaff.clickSaveEmployeeButton(driver);
		} catch (Exception ae) {
			System.out.println(ae.getMessage());
		} finally {
			driver.quit();
		}
	}
}