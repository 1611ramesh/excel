package org.excel;

public class Ude3 extends Exception{
	
public Ude3() {
System.out.println("exception class");}
		
public static void te(int i) {
try {
	throw new Ude3();
} catch (Exception e) {
System.out.println("handled");
}
} 
		
		
		
	
	
	
	
}
