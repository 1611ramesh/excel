package org.excel;

public class Ude extends Throwable{
public String message;
public Ude(String message) {
	this.message=message;
}

	public  void passmessage() {
	System.out.println("userdefined exception is"+ message );

	}
	
	
}
