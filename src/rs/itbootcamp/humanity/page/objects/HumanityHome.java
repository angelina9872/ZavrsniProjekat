package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
//	predstavlja POM Object klasu za stranicu www.humanity.com 
//	Realizovati pristup sledecim elementima na toj stranici: 

	// Xpathovi
	public static final String STARTPAGE_URL = "www.humanity.com";
	private static final String ABOUTUS = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGIN = "//p[contains(text(),'LOGIN')]";
	private static final String FREETRIALUP = "//a[@class='button pale']";
	private static final String FULLNAME = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORKEMAIL = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String FREETRIALDOWN = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	public static final String LOGIN_URL = "https://www.humanity.com/app/";
	// Login page
	private static final String LOGIN_USERNAME = "//input[@id='email']";
	private static final String LOGIN_PASSWORD = "//input[@id='password']";
	private static final String LOGIN_BUTTON = "//button[contains(text(),'Log in')]";

	// AboutUs
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUTUS));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

	// LogIn button
	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN));
	}

	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}

	// Free trial up button
	public static WebElement getFreeTrialUp(WebDriver driver) {
		return driver.findElement(By.xpath(FREETRIALUP));
	}

	public static void clickFreeTrialUp(WebDriver driver) {
		getFreeTrialUp(driver).click();
	}

	// Full name
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULLNAME));
	}

	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();
	}

	// Work email
	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORKEMAIL));
	}

	public static void clickWorkEmail(WebDriver driver) {
		getWorkEmail(driver).click();
	}

	// Free trial down
	public static WebElement getFreeTrialDown(WebDriver driver) {
		return driver.findElement(By.xpath(FREETRIALDOWN));
	}

	public static void clicFreeTrialDown(WebDriver driver) {
		getFreeTrialDown(driver).click();
	}

	// Log in
	// Insert Username
	public static WebElement getUsernameBox(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_USERNAME));
	}

	public static void clickUsernameBox(WebDriver driver) {
		getUsernameBox(driver).click();
	}

	public static void inputUsername(WebDriver driver, String data) {
		getUsernameBox(driver).sendKeys(data);
	}

	// Insert Password
	public static WebElement getPasswordBox(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_PASSWORD));
	}

	public static void clickPasswordBox(WebDriver driver) {
		getPasswordBox(driver).click();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPasswordBox(driver).sendKeys(data);
	}

	// Click login button
	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}
	public static void login(WebDriver driver) throws InterruptedException {
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
	}
	
	}

