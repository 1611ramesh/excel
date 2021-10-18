package org.excel;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Check extends Baseclass {
	public static void main(String[] args) throws AWTException {
		
	Baseclass b = new Baseclass();
	b.getdriver("https://www.google.co.in/");
	WebElement findelement = b.findelement("xpath", "//input[@class='gLFyf gsfi']");
b.roboword("b");

	
	
	
	
	
	
	}
}
