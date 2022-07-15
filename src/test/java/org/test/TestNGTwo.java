package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTwo {
	@BeforeClass
	public void browser() {
		System.out.println("Launch");
	}
	@AfterClass
	public void quit() {
		System.out.println("Quit");
	}
	@AfterMethod
	public void endTime() {
		System.out.println("EndTime");
	}
	@BeforeMethod
	public void startTime() {
		System.out.println("StartTime");
	}
	@Test
	public void tc02() {
		System.out.println("2");
	}

}
