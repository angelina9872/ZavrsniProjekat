package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
//	HumanityStaff - predstavlja POM Object klasu za stranicu vasafirma.humanity.com/app/staff/list/load/true/
//	Realizovati pristup elementima oznacenim crvenom bojom: 

//Xpathovi
	public static final String STAFFPAGE_URL = "https://kompanija57.humanity.com/app/staff/list/load/true/";
	private static final String ADDEMPLOYEE_BUTTON = "//button[@id='act_primary']";
	private static final String EMPLOYEE_LINK_START = "//a[contains(text(),'";
	private static final String EMPLOYEE_LINK_END = "')]";
	private static final String FIRSTNAME_BOX = "//input[@id='_asf1']";
	private static final String LASTNAME_BOX = "//input[@id='_asl1']";
	private static final String EMAIL_BOX = "//input[@id='_ase1']";

	// Add employee button
	public static WebElement getAddEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADDEMPLOYEE_BUTTON));
	}

	public static void clickAddEmployeeButton(WebDriver driver) {
		getAddEmployeeButton(driver).click();
	}

//Employee no. 1 link
	public static WebElement getEmployeeLink(WebDriver driver, String ime, String prezime) {
		return driver.findElement(By.xpath(EMPLOYEE_LINK_START + ime + prezime + EMPLOYEE_LINK_END));
	}

	public static void clickEmployeeLink(WebDriver driver, String ime, String prezime) {
		getEmployeeLink(driver, ime, prezime).click();
	}

	// First name box
	public static WebElement getFirstNameBox(WebDriver driver) {
		return driver.findElement(By.xpath(FIRSTNAME_BOX));
	}

	public static void clickFirstNameBox(WebDriver driver) {
		getFirstNameBox(driver).click();
	}

	public static void inputFirstName(WebDriver driver, String data) {
		getFirstNameBox(driver).sendKeys(data);
	}

	// First last box
	public static WebElement getLastNameBox(WebDriver driver) {
		return driver.findElement(By.xpath(LASTNAME_BOX));
	}

	public static void clickLastNameBox(WebDriver driver) {
		getLastNameBox(driver).click();
	}

	public static void inputLastName(WebDriver driver, String data) {
		getLastNameBox(driver).sendKeys(data);
	}

	// Email box
	public static WebElement getEmailBox(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_BOX));
	}

	public static void clickEmailBox(WebDriver driver) {
		getEmailBox(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmailBox(driver).sendKeys(data);
	}
}