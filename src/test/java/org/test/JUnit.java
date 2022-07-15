package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JUnit extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");

	}
	
	@Before
	public void before() {
		System.out.println("Before Each Method");

	}
	
	@After
	public void after() {
		System.out.println("After Each Method");

	}
	
	@Test
	public void tc01() {
		System.out.println("TC01");
		System.out.println(1);
		Assert.assertTrue(true);
		System.out.println(2);
		Assert.assertEquals("Hi", "Hi");
		System.out.println(1);
	}
	
	@Test
	public void tc02() {
		System.out.println("TC02");
		JUnit s = new JUnit();
		s.browseConfigChrome();
        s.openUrl("https://www.facebook.com/");
		
		s.maximizeWindow();
		
		String url = driver.getCurrentUrl();
		boolean contains = url.contains("facebook");
		Assert.assertTrue(contains);
		
		
		WebElement txtEmail = s.locateById("email");
		s.textInput(txtEmail, "Ram");
		
	   String attribute = s.getAttribute(txtEmail, "value"); // String attribute = txtEmail.getAttribute("value");
	    Assert.assertEquals("Ram", attribute);
		WebElement txtPass = s.locateById("pass");
		s.textInput(txtPass, "qwe");
		
		WebElement btnLogin = s.locateByName("login");
		s.click(btnLogin);
	}

}
