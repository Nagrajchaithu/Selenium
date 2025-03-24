package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class lgn {
	WebDriver dr;
	
	@Given("browser")
	public void browser() {
	   dr= new ChromeDriver();
	}

	@Then("Url")
	public void url() {
	    dr.get("https://demo.cyclos.org/ui/login");
	    dr.manage().window().maximize();
	    dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
		
	}

	@Then("click loggin")
	public void click_loggin() {
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		
	   
	}

	@Then("invalid {string}")
	public void invalid(String user) {
	WebElement wb =dr.findElement(By.xpath("//input[@type='text']"));
	  wb.sendKeys(user);
	    
		
	}

	@Then("invalidd {string}")
	public void invalidd(String password) {
	WebElement we=	dr.findElement(By.xpath("//input[@type='password']"));
	we.sendKeys(password);
	
	    	}

	@Then("click submit")
	public void click_submit() {
		dr.findElement(By.xpath("//span[text()='Submit']")).click();
	   
	}

}
