package Test_NG_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_01 {
	
	
	@Test(dataProvider="Vedavyasu")
	public void abc(String name,String gmail,String submit) {
		
		System.out.println("Enter URL");
		System.out.println("Click on Login button");
		System.out.println("Enter valid user name as"+" "+name);
		System.out.println("Enter valid password as"+" "+gmail);
	    System.out.println("Click on Submit button"+" "+submit);
	    System.out.println("-----------------------------------------------------");
		
		
	}
	
	@DataProvider(name="Vedavyasu")
	
	public String[][] loginpage() {
		String data[][]= {{"Srikant", "Srikanth@1234", "Accept"},
				           {"Nagaraju", "nagaraju@1234", "Accept"},
				           {"harikrishna", "hari@1234", "Accept"}};
		
		
		         return data;
		
		
	}

}
