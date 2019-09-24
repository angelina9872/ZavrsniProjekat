package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
//	Napraviti POM Objects klasu HumanityEditStaff koja omogucava 
//	da se doda slika na profil i promeni nicknamea zatim ta pdoesavanja sacuvaju. 

	public static final String EDITPROFILE_URL = "https://babicazabica.humanity.com/app/staff/detail/5089486/";
	private static final String SAVEEMPLOYEE_BUTTON = "//button[@id='act_primary']";
	private static final String EDITDETAILS_LINK = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOADPICTURE_BUTTON = "//input[@id='fileupload']";
	private static final String NICKNAME_BOX = "//input[@id='nick_name']";

	// Save employee
	public static WebElement getSaveEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEEMPLOYEE_BUTTON));
	}

	public static void clickSaveEmployeeButton(WebDriver driver) {
		getSaveEmployeeButton(driver).click();
	}

	// Edit details link
	public static WebElement getEditDetailsLink(WebDriver driver) {
		return driver.findElement(By.xpath(EDITDETAILS_LINK));
	}

	public static void clickEditDetailsLink(WebDriver driver) {
		getEditDetailsLink(driver).click();
	}

	// Upload picture
	public static WebElement getUploadPictureButton(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOADPICTURE_BUTTON));
	}

	public static void clickUploadPictureButton(WebDriver driver) {
		getUploadPictureButton(driver).click();
	}

	// Nickname box
	public static WebElement getNicknameBox(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME_BOX));
	}

	public static void clickNicknameBox(WebDriver driver) {
		getNicknameBox(driver).click();
	}

	public static void inputNickname(WebDriver driver, String data) {
		getNicknameBox(driver).sendKeys(data);
	}
}
