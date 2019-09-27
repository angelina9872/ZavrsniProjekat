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
	private static final String FIRSTNAME_BOX_START = "//input[@id='_asf";
	private static final String LASTNAME_BOX_START = "//input[@id='_asl";
	private static final String EMAIL_BOX_START = "//input[@id='_ase";
	private static final String BOX_END = "']";
	private static final String SAVEEMPLOYEE_BUTTON = "//button[@id='_as_save_multiple']";

	// Add employee button
	public static WebElement getAddEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADDEMPLOYEE_BUTTON));
	}

	public static void clickAddEmployeeButton(WebDriver driver) {
		getAddEmployeeButton(driver).click();
	}

	// Employee link
	public static WebElement getEmployeeLink(WebDriver driver, String firstname, String lastname, int i) {
		return driver.findElement(By.xpath(EMPLOYEE_LINK_START + firstname + lastname + EMPLOYEE_LINK_END));
	}

	public static void clickEmployeeLink(WebDriver driver, String firstname, String lastname, int i) {
		getEmployeeLink(driver, firstname, lastname, i).click();
	}

	// First name box
	public static WebElement getFirstNameBox(WebDriver driver, int i) {
		return driver.findElement(By.xpath(FIRSTNAME_BOX_START + i + BOX_END));
	}

	public static void clickFirstNameBox(WebDriver driver, int i) {
		getFirstNameBox(driver, i).click();
	}

	public static void inputFirstName(WebDriver driver, String data, int i) {
		getFirstNameBox(driver, i).sendKeys(data);
	}

	// First last box
	public static WebElement getLastNameBox(WebDriver driver, int i) {
		return driver.findElement(By.xpath(LASTNAME_BOX_START + i + BOX_END));
	}

	public static void clickLastNameBox(WebDriver driver, int i) {
		getLastNameBox(driver, i).click();
	}

	public static void inputLastName(WebDriver driver, String data, int i) {
		getLastNameBox(driver, i).sendKeys(data);
	}

	// Email box
	public static WebElement getEmailBox(WebDriver driver, int i) {
		return driver.findElement(By.xpath(EMAIL_BOX_START + i + BOX_END));
	}

	public static void clickEmailBox(WebDriver driver, int i) {
		getEmailBox(driver, i).click();
	}

	public static void inputEmail(WebDriver driver, String data, int i) {
		getEmailBox(driver, i).sendKeys(data);
	}

	// Add employee button
	public static WebElement getSaveEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEEMPLOYEE_BUTTON));
	}

	public static void clickSaveEmployeeButton(WebDriver driver) {
		getSaveEmployeeButton(driver).click();
	}



}