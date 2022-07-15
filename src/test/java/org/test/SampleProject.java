package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class SampleProject extends BaseClass {
	public static void main(String[] args) throws IOException {
		SampleProject s = new SampleProject ();
		
		browseConfigChrome();
		
		openUrl("https://www.facebook.com/");

		maximizeWindow();
		
		WebElement txtEmail = s.locateById("email");
		//s.textInput(txtEmail, "Ram");
		textInput(txtEmail, s.excelRead("C:\\Users\\Om Prakash\\eclipse-workspace\\Sample\\Excel\\Excel Ref.xlsx", "Sheet1", 1, 0));
		
		WebElement txtPass = s.locateById("pass");
		textInput(txtPass, "qwe");
		
		WebElement btnLogin = s.locateByName("login");
		s.click(btnLogin);
	}

}
