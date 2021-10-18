package org.excel;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait extends Baseclass {
	
	public static void main(String[] args) {
		//implicit wait
		implicitwait();
		WebDriverManager.chromedriver().setup();
	final WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
		//fluent wait
	org.openqa.selenium.support.ui.Wait<WebDriver>  w = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(Exception.class);
	WebElement until = w.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
			}
		});
		sendkey(until, "ram");
		
		
	}

}
