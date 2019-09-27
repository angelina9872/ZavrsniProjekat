package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityProfileTests {

	public static void editProfileTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HumanityHome.login(driver);
		try {
			HumanityProfile.clickArrowButton(driver);
			Thread.sleep(3000);
			HumanityProfile.clickProfileLink(driver);
			HumanityEditStaff.clickEditDetailsLink(driver);
			Thread.sleep(5000);
			String picture = "/home/angelina/Pictures/sova.jpg";
			HumanityEditStaff.inputProfilePicture(driver, picture);
			Thread.sleep(3000);
			HumanityEditStaff.clickNicknameBox(driver);
			HumanityEditStaff.inputNickname(driver, "Niknejm");
			HumanityEditStaff.clickSaveEmployeeButton(driver);

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		driver.quit();
	}

}