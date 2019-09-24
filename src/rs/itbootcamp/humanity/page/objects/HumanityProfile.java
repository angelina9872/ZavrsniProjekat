package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
//	Napisati POM Objects klasu HumanityProfile koja omogucava da se barata sa podesavanjima profila. 
//	Takodje omoguciti da s edohvati verzija aplikacije: 

	// Xpathovi
	private static final String ARROW_BUTTON = "//i[@class='icon icon-arrowFullDn j-arrowIconToAvatar navBottom__userArrow']";
	private static final String PROFILE_LINK = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_LINK = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_LINK = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String SIGNOUT_LINK = "//a[contains(text(),'Sign Out')]";
	private static final String VERSION = "//div[@id='humanityAppVersion']";
	
	// Arrow
	public static WebElement getArrowButton(WebDriver driver) {
		return driver.findElement(By.xpath(ARROW_BUTTON));
	}

	public static void clickAboutUs(WebDriver driver) {
		getArrowButton(driver).click();
	}

	// Profil link
	public static WebElement getProfileLink(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_LINK));
	}

	public static void clickProfileLink(WebDriver driver) {
		getProfileLink(driver).click();
	}

	// Settings link
	public static WebElement getSettingsLink(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_LINK));
	}

	public static void clickSettingsLink(WebDriver driver) {
		getSettingsLink(driver).click();
	}

	// Availability link
	public static WebElement getAvailabilityLink(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_LINK));
	}

	public static void clickAvailabilityLink(WebDriver driver) {
		getAvailabilityLink(driver).click();
	}

	// Sign out link
	public static WebElement getSignOutLink(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT_LINK));
	}

	public static void clickSignOutLink(WebDriver driver) {
		getSignOutLink(driver).click();
	}

	// Version
	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION));
	}
}
