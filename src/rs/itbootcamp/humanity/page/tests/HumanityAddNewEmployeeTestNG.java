package rs.itbootcamp.humanity.page.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

import org.openqa.selenium.WebDriver;
//Login-> Staff -> Add Employees -> Dodavanje novog zaposlenog
//Takodje je potrebno proveriti da li je dodavanje zaposlenog bilo uspešno.

public class HumanityAddNewEmployeeTestNG {

	@Test
	public static void addEmployeeTestNG(WebDriver driver) throws InterruptedException {

		HumanityHome.login(driver);
		try {
			// Dodavanje zaposlenog
			HumanityStaff.clickAddEmployeeButton(driver);
			HumanityStaff.clickFirstNameBox(driver, 1);
			HumanityStaff.inputFirstName(driver, "Zaza", 1);
			HumanityStaff.clickLastNameBox(driver, 1);
			HumanityStaff.inputLastName(driver, "Jafalovic", 1);
			HumanityStaff.clickEmailBox(driver, 1);
			HumanityStaff.inputEmail(driver, "zazajafalovic@gmail.com", 1);
			HumanityStaff.clickSaveEmployeeButton(driver);
			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());
			boolean employee = driver.getCurrentUrl()
					.contains("https://kompanija57.humanity.com/app/staff/assignstaff&new");
			Assert.assertTrue(employee);
			System.out.println("Employee added successfully.");

		} catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		} finally {
			driver.quit();
		}
	}
}
