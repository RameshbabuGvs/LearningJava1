package com.tetsNg;

import org.testng.annotations.Test;

public class TestNg {
	

	public void Rammethod() {
		
		System.out.println("Rammethod");
	}
	public void Rammethod4() {
		
		System.out.println("Rammethod4");
	}
	@Test(priority = '0')
	public void Rammethod1() {
		
		System.out.println("Rammethod1");
	}
	
	@Test()
	public void Rammethod2() {
		
		System.out.println("Rammethod2");
	}
	@Test()
	public void Rammethod3() {
		
		System.out.println("Rammethod3");
	}
	@Test()
	public void Rammethod6() {
		
		System.out.println("Rammethod6");
	}
	
}
