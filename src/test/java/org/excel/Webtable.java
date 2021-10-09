package org.excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	WebElement findElement = driver.findElement(By.tagName("table"));
	WebElement findElement2 = findElement.findElement(By.tagName("tbody"));
	List<WebElement> findElements = findElement2.findElements(By.tagName("tr"));
	List<WebElement> findElements2 = findElement2.findElements(By.tagName("td"));
	int size2 = findElements2.size();
	int size = findElements.size();
	for (int i = 2; i < 3; i++) {
		WebElement webElement = findElements.get(i);
		for (int j = 21; j <22 ; j++) {
			WebElement webElement2 = findElements2.get(j);
			String text = webElement2.getText();
			System.out.println(size2);
		}
	}
	
}
}
