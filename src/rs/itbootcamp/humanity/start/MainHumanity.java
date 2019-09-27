package rs.itbootcamp.humanity.start;

import java.util.Scanner;

import rs.itbootcamp.humanity.page.tests.HumanityCompleteTest;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.itbootcamp.humanity.page.tests.HumanityHomepageTests;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.itbootcamp.humanity.page.tests.HumanityProfileTests;
import rs.itbootcamp.humanity.page.tests.HumanitySettingsTests;

public class MainHumanity {

	public static void main(String[] args) throws InterruptedException {
		// Set-up

		Scanner sc = new Scanner(System.in);

		System.out.println("You are testing: www.humanity.com.");

		{
			System.out.println("Press:");
			System.out.println("1 - Login test");
			System.out.println("2 - Login test with excel data");
			System.out.println("3 - Test homepage buttons ");
			System.out.println("4 - Add employee");
			System.out.println("5 - Add employee with excel data");
			System.out.println("6 - Test settings page");
			System.out.println("7 - Test edit profile page");
			System.out.println("8 - Complete test");

			int br = sc.nextInt();

			switch (br) {
			case 1:
				HumanityLoginTests.loginTest();
				break;
			case 2:
				HumanityLoginTests.loginWithData();
				break;
			case 3:
				HumanityHomepageTests.homepageTest();
				break;
			case 4:
				HumanityAddNewEmployeeTests.addEmployeeTest();
				break;
			case 5:
				HumanityAddNewEmployeeTests.addEmployeeWithData();
				break;
			case 6:
				HumanitySettingsTests.settingsTest();
				break;
			case 7:
				HumanityProfileTests.editProfileTest();
				break;
			case 8:
				HumanityCompleteTest.completeTest();
				break;
			default:
				System.out.println("Bad entry!");
				break;
			}
			sc.close();
		}

	}

}
