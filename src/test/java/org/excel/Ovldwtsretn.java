package org.excel;

import org.openqa.selenium.WebElement;

public class Ovldwtsretn {
private String student() {
String s="rahul";
	return s;
}
private int student(int  i)
{
	
	return i ;
}
	private String student(int i , String s )
	{
		System.out.println(s);
	s="rajesh";
	return s;
	}
private String student(String i ,int s ,int f)
{
	i="ragj";

return i ;
}
public static void main(String[] args) {
	Ovldwtsretn o = new Ovldwtsretn();
	int student = o.student(50);
	System.out.println(student);
	Object student2 = o.student(student, null);
	System.out.println(student2);
	
	
}






}
