package org.excel;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Training extends Baseclass{
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	final WebDriver driver = new ChromeDriver();
	WebDriverWait w = new WebDriverWait(driver, 10);
	driver.get("https://www.amazon.in/");
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iphone",Keys.ENTER);
	WebElement findElement2 = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	findElement2.click();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		if (!windowHandle.equals(string)) {
			driver.switchTo().window(string);
		}
	}
	WebElement findElement3 = driver.findElement(By.id("add-to-cart-button"));
	findElement3.click();
	//Thread.sleep(3000);
	//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	
	//WebElement until = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='a-button-input']")));
	
	//fluent wait
	Wait<WebDriver> we =new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(4, TimeUnit.SECONDS).ignoring(Exception.class);
	WebElement until = we.until(new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver t) {
			// TODO Auto-generated method stub
			return driver.findElement(By.xpath("//input[@class='a-button-input']"));
		}
	});
	//WebElement findElement4 = driver.findElement(By.xpath("//input[@class='a-button-input']"));
	
	
	click(until);
   //Thread.sleep(3000);
	driver.switchTo().window(windowHandle);
	WebElement findElement5 = driver.findElement(By.id("twotabsearchtextbox"));
	findElement5.clear();
	findElement5.sendKeys("samsung phone",Keys.ENTER);
	
	
	
	
	
	
}
}
