package org.excel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		TakesScreenshot o = (TakesScreenshot) driver;
		File screenshotAs = o.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\1611r\\Desktop\\framewwork\\a.png");
	FileUtils.copyFile(screenshotAs, f);
		List<WebElement> findElements = driver.findElements(By.tagName("link href"));
		int size = findElements.size();
		
		System.out.println(size);
		
		}

	
	
}
