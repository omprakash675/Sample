package org.test;

public class POMFaceBook extends BaseClass {
	public static void main(String[] args) {
		browseConfigChrome();
		openUrl("https://www.facebook.com/");
		maximizeWindow();
		
		POMLogin l = new POMLogin();
		
		textInput(l.getTxtEmail(), "Welcome");
		
		refresh();
		
		textInput(l.getTxtPass(), "qwer");
		
	    click(l.getBtnLogin());
		
		
		
	}

}
