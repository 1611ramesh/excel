package org.excel;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Green extends Baseclass{
	@BeforeClass
public static void lanch() {
getdriver("https://adactinhotelapp.com/");
String gettitle = gettitle();
System.out.println(gettitle);
Assert.assertEquals("Adactin.com - Hotel Reservation System", gettitle);
System.out.println("success");

}
	@Before
	public void date() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() throws IOException {
Pom p = new Pom();
WebElement username = p.getUsername();
String attribute = username.getAttribute("id");
System.out.println(attribute);
Assert.assertEquals("username", attribute);
String getcellvalue = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 0, 0);
sendkey(username, getcellvalue);
WebElement password = p.getPassword();
String getcellvalue2 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 1, 0);
sendkey(password, getcellvalue2);
WebElement login = p.getLogin();
String attribute2 = login.getAttribute("id");
login.click();
Assert.assertEquals("login", attribute2);
System.out.println("ok");
	}

	@Test
	public void tc2() throws IOException, InterruptedException {
		Pom p = new Pom();
		WebElement location = p.getLocation();
		String c = location.getAttribute("name");
		System.out.println(c);
		
		String getcellvalue3 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 4, 2);
		p.selectbyindex(location, Integer.valueOf(getcellvalue3));
		WebElement hotels = p.getHotels();
		selectbyindex(hotels, Integer.valueOf(getcellvalue3));
		WebElement roomtype = p.getRoomtype();
		selectbyindex(roomtype, Integer.valueOf(getcellvalue3));
		WebElement numberofrooms = p.getNumberofrooms();
		selectbyindex(numberofrooms, Integer.valueOf(getcellvalue3));
		WebElement checkindate = p.getCheckindate();
		checkindate.clear();
		String getcellvalue4 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 0);
		sendkey(checkindate, getcellvalue4);
		WebElement checkoutdate = p.getCheckoutdate();
		checkoutdate.clear();
		String getcellvalue5 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 1);
		sendkey(checkoutdate, getcellvalue5);
		
		
		
		
		
		
	
	}
	
	@After
	public void loginend() {
Date d1 = new Date();
System.out.println(d1);
	}

	
}

