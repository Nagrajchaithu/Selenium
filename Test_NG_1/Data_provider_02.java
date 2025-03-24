package Test_NG_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_02 {
	
	@Test(dataProvider="devara")
	
	public void verify (String username,String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println("----------------------------------------------------------");
		
		
		
	}
	@DataProvider(name="devara")
	
	public String[][] loginpage(){
		String data[][]= new String [3][2];
		
		//1st Row
		
		data[0][0]="Srikanth";
		data[0][1]="Srikanth@1234";
		
		//2n row
		
		data[1][0]="nagaraju";
		data[1][1]="nagaraju@1234";
		
		
		//3rd row
		data[2][0]="hari";
		data[2][1]="hari@1234";
		
		return data;
		
		
		
		
		
	}

}
