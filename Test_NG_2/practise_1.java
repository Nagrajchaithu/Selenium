package Test_NG_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practise_1 {

	
	@Test
	public void loginpage() {
	WebDriver 	dr= new ChromeDriver();
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		practise_2 mm= new practise_2 (dr);
		mm.getuser("demo");
		mm.getpass("1234");
		mm.click();
		
		
		
		
	}
	
	
	
	


}
