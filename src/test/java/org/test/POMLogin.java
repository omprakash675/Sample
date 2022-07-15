package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POMLogin extends BaseClass{
	public POMLogin() { //Constructor
		PageFactory.initElements(driver, this);
	}
	@FindBys({ //AND Operator
	@FindBy(id="email"), //Correct
	@FindBy(xpath="//input[@id='email']") //Correct
	})
	private WebElement txtEmail;
	
	@FindAll({ //OR Operator
	@FindBy(id="pass"), //Correct
	@FindBy(name="password") //Incorrect
	
	})
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

}
