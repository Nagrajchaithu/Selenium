package Practise_cuc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class p1 {
	WebDriver dr;
	

@Given("open the Browser")
public void open_the_browser() {
	dr= new ChromeDriver();
	
	
   
}

@When("user enter the url")
public void user_enter_the_url() {
	dr.get("https://demo.cyclos.org/ui/home");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
   
}

@When("click on login button")
public void click_on_login_button() {
	dr.findElement(By.xpath("//div[text()=' Login ']")).click();
	
	
	
   
}

@When("user enter valid username")
public void user_enter_valid_username() {
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
	
}

@When("user enter valid password")
public void user_enter_valid_password() {
	dr.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	
	
   }

@Then("user click on submit button")
public void user_click_on_submit_button() {
	dr.findElement(By.xpath("//span[text()='Submit']")).click();
   
	
}

@Then("close the Window")
public void close_the_window() {
	dr.close();
   
	
}

@When("user enter invalid username")
public void user_enter_invalid_username() {
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo1");
   
}

@When("user enter invalid password")
public void user_enter_invalid_password() {
	dr.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
   
	
}

@Then("user click on submit buttonn")
public void user_click_on_submit_buttonn() {
	dr.findElement(By.xpath("//span[text()='Submit']")).click();
   
	
}

@Then("close the Windoww")
public void close_the_windoww() {
    
	
}


}
