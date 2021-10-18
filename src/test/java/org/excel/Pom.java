package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom extends Baseclass{
public Pom() {
	PageFactory.initElements(driver, this);
}
@FindBy (id="username")
private WebElement Username;
@FindBy (id="password")
private WebElement Password;
@FindBy (id="login")
private WebElement login;
@FindBy(id ="location")
private WebElement Location;
@FindBy(id="hotels")
private WebElement Hotels;
@FindBy(id="room_type")
private WebElement Roomtype;
@FindBy(id="room_nos")
private WebElement numberofrooms ;
@FindBy(id="datepick_in")
private WebElement checkindate;
@FindBy(id="datepick_out")
private WebElement checkoutdate;
@FindBy(id="adult_room")
private WebElement adultperroom;
@FindBy(id="child_room")
private WebElement childperroom;
@FindBy(id="Submit")
private WebElement summit;
@FindBy(id="radiobutton_0")
private WebElement radio;
@FindBy(id="continue")
private WebElement Continue;
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement cardnumber;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardnumber() {
	return cardnumber;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getExpirymonth() {
	return expirymonth;
}
public WebElement getExpiryyear() {
	return expiryyear;
}
public WebElement getCvvnum() {
	return cvvnum;
}
@FindBy(id="cc_type")
private WebElement cardtype;
@FindBy(id="cc_exp_month")
private WebElement expirymonth;
@FindBy(id="cc_exp_year")
private WebElement expiryyear;
@FindBy(id="cc_cvv")
private WebElement cvvnum;
@FindBy(id="book_now")
private WebElement booknow;
@FindBy(id="order_no")
private WebElement orderno;

public WebElement getOrderno() {
	return orderno;
}
public WebElement getBooknow() {
	return booknow;
}
public WebElement getRadio() {
	return radio;
}
public WebElement getContinue() {
	return Continue;
}
public WebElement getSummit() {
	return summit;
}
public WebElement getChildperroom() {
	return childperroom;
}
public WebElement getNumberofrooms() {
	return numberofrooms;
}
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckoutdate() {
	return checkoutdate;
}
public WebElement getAdultperroom() {
	return adultperroom;
}
public WebElement getRoomtype() {
	return Roomtype;
}
public WebElement getLocation() {
	return Location;
}
public WebElement getHotels() {
	return Hotels;
}
public WebElement getUsername() {
	return Username;
}
public WebElement getPassword() {
	return Password;
}
public WebElement getLogin() {
	return login;
}






}
