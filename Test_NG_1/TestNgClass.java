package Test_NG_1;

import org.testng.annotations.Test;

public class TestNgClass {
	
	@Test(priority=1,groups="Smoke")
	
	public void smt() {
		System.out.println("this is smoke");
	}
	
	
	@ Test(enabled =false)
	
	public void ww() {
		System.out.println("Test 2");
	}
	
	@Test(groups="sanity",priority=2)
	
	public void kk() {
		System.out.println("This is sanity");
	}
	
	
	@Test (priority=3,invocationCount=5)
	
	public void aa() {
		System.out.println("Incovention Count");
		
	}
	
	@Test (groups="Reg")
	
	public void ff() {
		System.out.println("this is reggression");
		
	}

}
