package application_Hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class demo1 {
public	static WebDriver dr;
	@Before
	public void pre() {
		dr= new ChromeDriver();
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.findElement(By.xpath("//div[text()=' Login '] ")).click();
		
	}
	
	public static WebDriver getDriver()
	{
		return dr;
	}
	@After
	public void post() {
		dr.close();
	}
	
	@BeforeStep()
	public void zz() {
		System.out.println("before step");
		
		
	}
	@AfterStep()
		public void xx() {
		System.out.println("After step");
			
		}
	}

	


