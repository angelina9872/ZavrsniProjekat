package rs.itbootcamp.humanity.page.tests;

public class HumanityCompleteTest {

	public static void completeTest() throws InterruptedException {
		HumanityLoginTests.loginTest();
		HumanityHomepageTests.homepageTest();
		HumanitySettingsTests.settingsTest();
		HumanityAddNewEmployeeTests.addEmployeeTest();
		HumanityProfileTests.editProfileTest();
		System.out.println("Complete test finished.");
	}

}
