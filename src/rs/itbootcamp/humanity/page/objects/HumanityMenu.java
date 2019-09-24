package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
//	HumanityMenu - predstavlja POM Object klasu za stranicu vasafirma.humanity.com/app/dashboard/ 
//	Realizovati pristup sledecim elementima na toj stranici:

	// Xpathovi
	public static final String HOMEPAGE_URL = "https://kompanija57.humanity.com/app/staff/list/load/true/";
	// After clicking 'Staff' button
	private static final String DASHBOARD_BUTTON = "//p[contains(text(),'Dashboard')]";
	private static final String STAFFPLANING_BUTTON = "//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String TIMECLOCK_BUTTON = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE_BUTTON = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_BUTTON = "//p[contains(text(),'Training')]";
	private static final String STAFF_BUTTON = "//p[contains(text(),'Staff')]";
	private static final String PAYROLL_BUTTON = "//p[contains(text(),'Payroll')]";
	private static final String REPORTS_BUTTON = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	private static final String SETTINGS_BUTTON = "//i[@class='primNavQtip__icon icon-gear']";

	// Dashboard
	public static WebElement getDashboardButton(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_BUTTON));
	}

	public static void clickDashboardButton(WebDriver driver) {
		getDashboardButton(driver).click();
	}

	// Staff planing button
	public static WebElement getStaffPlanningButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFFPLANING_BUTTON));
	}

	public static void clickStaffPlanningButton1(WebDriver driver) {
		getStaffPlanningButton(driver).click();
	}

	// Time clock button
	public static WebElement getTimeClockButton(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_BUTTON));
	}

	public static void clickTimeClockButton(WebDriver driver) {
		getTimeClockButton(driver).click();
	}

	// Leave button
	public static WebElement getLeaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_BUTTON));
	}

	public static void clickLeaveButton(WebDriver driver) {
		getLeaveButton(driver).click();
	}

	// Training button
	public static WebElement getTrainingButton(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_BUTTON));
	}

	public static void clickTrainingButton(WebDriver driver) {
		getTrainingButton(driver).click();
	}

	// Staff button
	public static WebElement getStaffButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_BUTTON));
	}

	public static void clickStaffButton(WebDriver driver) {
		getStaffButton(driver).click();
	}

	// Payroll button
	public static WebElement getPayrollButton(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_BUTTON));
	}

	public static void clickPayrollButton(WebDriver driver) {
		getPayrollButton(driver).click();
	}

	// Reports button
	public static WebElement getReportsButton(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_BUTTON));
	}

	public static void clickReportsButton(WebDriver driver) {
		getReportsButton(driver).click();
	}

	// Settings button
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}
}
