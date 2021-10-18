package org.excel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class pom2 extends Baseclass {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		getdriver("https://adactinhotelapp.com/");
		Pom p = new Pom();
		WebElement username = p.getUsername();
		String getcellvalue = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 0, 0);
		p.sendkey(username, getcellvalue);
WebElement password = p.getPassword();
String getcellvalue2 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 1, 0);
p.sendkey(password, getcellvalue2);
WebElement login = p.getLogin();
login.click();
WebElement location = p.getLocation();
String getcellvalue3 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 4, 2);
selectbyindex(location, Integer.parseInt(getcellvalue3));
WebElement hotels = p.getHotels();
selectbyindex(hotels, Integer.parseInt(getcellvalue3));
WebElement roomtype = p.getRoomtype();
selectbyindex (roomtype, Integer.parseInt(getcellvalue3));
WebElement numberofrooms = p.getNumberofrooms();
selectbyindex(numberofrooms,Integer.parseInt(getcellvalue3) );
WebElement checkindate = p.getCheckindate();
checkindate.clear();
String getcellvalue4 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 0);
checkindate.sendKeys(getcellvalue4);
WebElement checkoutdate = p.getCheckoutdate();
checkoutdate.clear();
String getcellvalue5 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 1);
checkoutdate.sendKeys(getcellvalue5);
WebElement adultperroom = p.getAdultperroom();
selectbyindex(adultperroom,Integer.parseInt(getcellvalue3) );
WebElement childperroom = p.getChildperroom();
selectbyindex(childperroom, Integer.parseInt(getcellvalue3));
WebElement summit = p.getSummit();
summit.click();
WebElement radio = p.getRadio();
radio.click();
WebElement continue1 = p.getContinue();
continue1.click();
WebElement firstname = p.getFirstname();
String getcellvalue6 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 2, 2);
firstname.sendKeys(getcellvalue6);
WebElement lastname = p.getLastname();
String getcellvalue7 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 3, 2);
lastname.sendKeys(getcellvalue7);
WebElement address = p.getAddress();
String getcellvalue8 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 3, 0);
address.sendKeys(getcellvalue8);
WebElement cardnumber = p.getCardnumber();
String getcellvalue9 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 4, 0);
cardnumber.sendKeys(getcellvalue9);
WebElement cardtype = p.getCardtype();
selectbyindex(cardtype, 2);
WebElement expirymonth = p.getExpirymonth();
selectbyindex(expirymonth, 2);
WebElement expiryyear = p.getExpiryyear();
selectbyindex(expiryyear, 2);
WebElement cvvnum = p.getCvvnum();
String getcellvalue10 = p.getcellvalue("C:\\Users\\1611r\\Desktop\\adactin.xlsx", "Sheet1", 4, 1);
cvvnum.sendKeys(getcellvalue10);
WebElement booknow = p.getBooknow();
booknow.click();
Thread.sleep(8000);
WebElement orderno = p.getOrderno();
String getattributes = p.getattributes(orderno, "value");
p.createcellvalue("C:\\Users\\1611r\\Desktop\\framewwork\\pojo2.xlsx", "sheet2", 0, 0, getattributes);
System.out.println("order number is"+"\n"+getattributes);









	}
}
