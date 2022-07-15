package org.test;

import org.testng.annotations.Test;

public class TestNGGrouping {
	@Test(groups="Regression")
	public void tc01() {
		System.out.println("1");
	}
	@Test(groups="Smoke")
	public void tc02() {
		System.out.println("2");
	}
	@Test(groups="Regression")
	public void tc03() {
		System.out.println("3");
	}
	@Test(groups="Smoke")
	public void tc04() {
		System.out.println("3");
	}

}
