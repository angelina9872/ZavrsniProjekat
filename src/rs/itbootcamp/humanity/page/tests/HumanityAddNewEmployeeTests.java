package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.utility.ExcelUtils;

public class HumanityAddNewEmployeeTests {

	public static boolean addEmployeeTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try {
			HumanityHome.login(driver);
			// Open home page and then staff page
			HumanityMenu.clickStaffButton(driver);
			Thread.sleep(3000);
			// Add employee
			HumanityStaff.clickAddEmployeeButton(driver);
			HumanityStaff.clickFirstNameBox(driver, 1);
			HumanityStaff.inputFirstName(driver, "Zlatko", 1);
			HumanityStaff.clickLastNameBox(driver, 1);
			HumanityStaff.inputLastName(driver, "Milojevic", 1);
			HumanityStaff.clickEmailBox(driver, 1);
			HumanityStaff.inputEmail(driver, "yrimer@gmail.com", 1);
			HumanityStaff.clickSaveEmployeeButton(driver);
			Thread.sleep(3000);
			if (driver.getCurrentUrl().contains("https://kompanija57.humanity.com/app/staff/assignstaff&new")) {
				System.out.println("Employee added successfully");
			} else {
				System.out.println("Failed to add employee");
			}
		} catch (Exception ae) {
			System.out.println(ae.getMessage());
		} finally {
			// driver.quit();
		}
		driver.quit();
		return true;
	}

	public static void addEmployeeWithData() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityHome.login(driver);
		// Open home page and staff page and add employee page
		HumanityMenu.clickStaffButton(driver);
		Thread.sleep(3000);
		HumanityStaff.clickAddEmployeeButton(driver);
		try {
			// Set Excell
			String DATA_SOURCE = "Data.xls";
			ExcelUtils.setExcell(DATA_SOURCE);
			ExcelUtils.setWorkSheet(1);

			// Insert employee
			String name, lastname, email;
			int rownumber = ExcelUtils.getRowNumber();

			for (int i = 1; i < rownumber; i++) {

				HumanityStaff.clickFirstNameBox(driver, 1);
				name = ExcelUtils.getDataAt(i, 0);
				HumanityStaff.inputFirstName(driver, name, 1);

				HumanityStaff.clickLastNameBox(driver, 1);
				lastname = ExcelUtils.getDataAt(i, 1);
				HumanityStaff.inputLastName(driver, lastname, 1);

				HumanityStaff.clickEmailBox(driver, 1);
				email = ExcelUtils.getDataAt(i, 2);
				HumanityStaff.inputEmail(driver, email, 1);
				Thread.sleep(3000);
				HumanityStaff.clickSaveEmployeeButton(driver);
				Thread.sleep(3000);
				if (driver.getCurrentUrl().contains("https://kompanija57.humanity.com/app/staff/assignstaff&new")) {
					System.out.println("Employee added successfully.");
				} else {
					System.out.println("Failed to add employee.");
				}
				HumanityStaff.clickAddEmployeeButton(driver);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			driver.quit();
		}
	}
}
