package rs.itbootcamp.humanity.start;

import rs.itbootcamp.humanity.page.tests.AddEmployeeTest;
import rs.itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTestNG;

public class MainHumanity {

	public static void main(String[] args) throws InterruptedException {
		HumanityAddNewEmployeeTestNG.addEmployeeTest();
		AddEmployeeTest.addEmployeeTest();
		
	}

}
