package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameters {
	
	@Parameters({"user","pass"})
	@Test
	public void tc01(@Optional("asd")String email, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		
	//	<parameter name="email" value="Ram"></parameter>
		//  <parameter name="pass" value="zxc"></parameter>

	}

}
