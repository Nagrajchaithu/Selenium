package Test_NG_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_03 {
	
	//Admin=1,passwod1
	//Admin2,password2
	//Admin3, password3
	
	@Test(dataProvider="nagaraju")
	
	public void test1(String username,String password) {
		
		System.out.println("Open Browser");
		System.out.println("Click on login button");
		System.out.println("Enter username as"+username);
		System.out.println("Enter password as"+password);
		System.out.println("Clock on submit button");
		System.out.println("........................................................");
		
	}
	
	@DataProvider(name="nagaraju")
	
	public String [][] loginpage() {
		
		
		String data[][]= {{"Admin1","password1"},{"Admin2","password2"},{"Admin3","password3"}};
		
		return data;
		
	}

}
