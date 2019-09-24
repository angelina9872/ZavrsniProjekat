package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class HumanitySettings {
//	U HumanitySettings omoguciti POM Object interakciju za postavku sledecih podataka: 
//		Country
//		Default Language
//		Time Format

	public static String SETTINGS_URL="https://babicazabica.humanity.com/app/admin/settings/";
	private static String COUNTRY_SELECT="//label[contains(text(),'Country')]";
	private static String LANGUAGE_SELECT="//select[@name='language']";
	private static String TIMEFORMAT_SELECT="//select[@name='pref_24hr']";
	
	///Select Country
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_SELECT)));
	}

	public static void inputCountry(WebDriver driver,String data) {
		getCountry(driver).selectByVisibleText(data);
	}
	//Select language
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_SELECT)));
	}

	public static void inputLanguage(WebDriver driver,String data) {
		getLanguage(driver).selectByVisibleText(data);
	}
	//Select timeformat
	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIMEFORMAT_SELECT)));
	}

	public static void inputTimeFormat(WebDriver driver,String data) {
		getTimeFormat(driver).selectByVisibleText(data);
	}
	
}

