package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityHomepageTests {

	@SuppressWarnings("finally")
	public static boolean homepageTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityHome.login(driver);
		try {
			HumanityMenu.clickDashboardButton(driver);
			Thread.sleep(2000);
			HumanityMenu.clickStaffPlanningButton1(driver);
			Thread.sleep(2000);
			HumanityMenu.clickTimeClockButton(driver);
			Thread.sleep(2000);
			HumanityMenu.clickLeaveButton(driver);
			Thread.sleep(2000);
			HumanityMenu.clickTrainingButton(driver);
			Thread.sleep(2000);
			HumanityMenu.clickStaffButton(driver);
			Thread.sleep(2000);
			HumanityMenu.clickPayrollButton(driver);
			Thread.sleep(2000);
			HumanityMenu.clickReportsButton(driver);
			Thread.sleep(3000);
			if (driver.getCurrentUrl().equals("https://kompanija57.humanity.com/app/reports/dashboard/")) {
				System.out.println("All buttons work.");
				return true;
			} else {
				System.out.println("Something went wrong.");
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
