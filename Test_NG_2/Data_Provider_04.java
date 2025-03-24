package Test_NG_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_04 {
	WebDriver dr;
	
	@BeforeMethod
	public void mm() {
		dr=new ChromeDriver();
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		
		
  
	}
	
	@Test (dataProvider="JaiSriram")
	public void abc(String username,String password) throws InterruptedException {
		
		WebElement wb=dr.findElement(By.xpath("//input[@type='text']"));
		wb.sendKeys(username);
		
         WebElement wc =dr.findElement(By.xpath("//input[@type='password']"));
         wc.sendKeys(password);
         dr.findElement(By.xpath("//span[text()='Submit']")).click();
         Thread.sleep(5000);
		
		
		
	}
	@DataProvider(name="JaiSriram")
	
	public String [][] loginpage(){
		
		String data[][]= {{"raju","1234"},
		
		                   {"Hari","1234"},
		                   {"demo","1234"}};
		return data;
		
		
	}
	

}
