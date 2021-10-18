package org.excel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit2 {
	@Test
	public  void tc1() {
		System.out.println("ramesh");
	}

	@BeforeClass
	public static void tc2() {
		System.out.println("kumar2");
	}

	@AfterClass
	public static void tc3() {
		System.out.println("bhaghu2");
	}
}
