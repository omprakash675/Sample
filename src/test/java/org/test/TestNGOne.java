package org.test;

import org.testng.annotations.Test;

public class TestNGOne {
	@Test(priority=-3)
	public void tc01() {
		System.out.println("1");
	}
	@Test(priority=-2)
	public void tc02() {
		System.out.println("2");
	}
	@Test(priority=2, invocationCount=4)
	public void tc03() {
		System.out.println("3");
	}
	@Test(priority=4, enabled=false)
	public void tc04() {
		System.out.println("3");
	}

}
