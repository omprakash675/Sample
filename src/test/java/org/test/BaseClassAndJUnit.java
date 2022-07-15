package org.test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class BaseClassAndJUnit extends BaseClass {
	@Before
	public void beforeClass() {
		browseConfigChrome();
		openUrl("https://www.facebook.com/");
	}
	@After
	public void afterClass() {
		closeBrowser();
	}
	
	@Test
	public void Tc01() throws IOException, InterruptedException {
		
		WebElement txtEmail = locateById("email");
		textInput(txtEmail, excelRead("C:\\Users\\Om Prakash\\eclipse-workspace\\Sample\\Excel\\Excel Ref.xlsx", "Sheet2", 0, 0));
		
		WebElement txtPass = locateById("pass");
		textInput(txtPass, excelRead("C:\\Users\\Om Prakash\\eclipse-workspace\\Sample\\Excel\\Excel Ref.xlsx", "Sheet2", 1,0));
		
		Thread.sleep(5000);
		WebElement btnLogin = locateByName("login");
		click(btnLogin);

	}
	
	@Test
	public void Tc02() throws IOException, InterruptedException {
		WebElement txtEmail = locateById("email");
		textInput(txtEmail, "Vicky");
		
		WebElement txtPass = locateById("pass");
		textInput(txtPass, "098765");
		
		Thread.sleep(5000);
		WebElement btnLogin = locateByName("login");
		click(btnLogin);

	}

}
