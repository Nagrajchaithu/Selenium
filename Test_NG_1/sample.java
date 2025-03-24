package Test_NG_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {
	
	@BeforeSuite
	
	public void sub() {
		System.out.println("before suit");
	}
	
	@BeforeTest
	public void add() {
		
    System.out.println("Before test");
	}
	
	
	
	@BeforeClass
	
	public void one() {
		System.out.println("Before class");
	}
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("BeforeMethod");
		
		}
	
		
	
	
	@Test(priority=1)
	public void mm() {
		System.out.println("Test 1");
	}
	
	
	
	@Test (priority=2)
	public void abc() {
		System.out.println("Test 2");
	}
	
	
	@AfterMethod
	public void close() {
		System.out.println("AfterMethod");
		
	}
	
	@AfterClass
	public void logout() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void quit() {
		System.out.println("After test");
		
	}
	
	@AfterSuite
	public void dev() {
		System.out.println("After suite");
		
	}
	

}
