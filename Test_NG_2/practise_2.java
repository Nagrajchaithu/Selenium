package Test_NG_2;

import org.testng.annotations.Test;

public class practise_2 {
	@Test 
	
	public void aa() {
		System.out.println("test 3");
	}
	
	@Test 
	public void dd() {
		System.out.println("test 4");
	}
	@Test (dependsOnMethods="dd")
	
	public void ll() {
		System.out.println("test 5");

}
}