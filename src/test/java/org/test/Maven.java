package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.safaridriver().setup();
		WebDriverManager.iedriver().setup();
		
		//Launch
	//	WebDriver driver = new ChromeDriver ();
		WebDriver driver = new EdgeDriver ();
	//	WebDriver driver = new FirefoxDriver ();
	//	WebDriver driver = new SafariDriver ();
	//	WebDriver driver = new InternetExplorerDriver ();
		
		//URL
		driver.get("https://www.facebook.com/");
	}

}
